package module_13;

import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static String newUserJson = "{\"name\":\"John Doe\",\"username\":\"johndoe\",\"email\":\"john.doe@goit.com\"}";
    private static String updatedUserJson = "{\"name\":\"John Updated\",\"username\":\"john_updated\",\"email\":\"john.updated@goit.com\"}";
    private static int userId;

    public static void main(String[] args) throws IOException {

        // Task_1
        createUser();
        updateUser(userId - 1); //            Використовую '-1' тому що затримка на сервері
        deleteUser(userId - 1); //            і новий юзер ще не з'явився з новим айді у них 🥲
        getUserById(userId - 1); //           а може він і зовсім не з'явиться 😊
        getAllUsers();
        getUserByUsername("Bret");

        // Task_2
        getAndSaveLatestPostComments(userId - 1);

        // Task_3
        getAllOpenTasksForUser(userId - 1);
    }

    private static String sendHttpRequest(String urlString, String requestMethod, String requestBody) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod(requestMethod);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        if (requestBody != null) {
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
        }

        StringBuilder response = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            String responseLine;
            while (( responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
        }

        if (response.isEmpty() || response.toString().equals("{}")) {
            return String.valueOf(connection.getResponseCode());
        }

        connection.disconnect();
        return response.toString();
    }

    // Task_1: methods:
    private static void createUser() throws IOException {
        String response = sendHttpRequest(BASE_URL + "/users", "POST", newUserJson);
        userId = JsonParser.parseString(response)
                .getAsJsonObject()
                .getAsJsonPrimitive("id")
                .getAsInt();

        System.out.println("Created user: " + response);
    }

    private static void updateUser(int userId) throws IOException {
        String response = sendHttpRequest(BASE_URL + "/users/" + userId, "PUT", updatedUserJson);

        System.out.println("Updated user: " + response);
    }

    private static void deleteUser(int userId) throws IOException {
        String response = sendHttpRequest(BASE_URL + "/users/" + userId, "DELETE", null);

        System.out.println("Deleted user with id " + userId + ". Response code: " + response);
    }

    private static void getAllUsers() throws IOException {
        String response = sendHttpRequest(BASE_URL + "/users", "GET", null);

        System.out.println("All users: " + response);
    }

    private static void getUserById(int userId) throws IOException {
        String response;
        response = sendHttpRequest(BASE_URL + "/users/" + userId, "GET", null);

        System.out.println("User by ID " + userId + ": " + response);
    }

    private static void getUserByUsername(String username) throws IOException {
        String response;

        response = sendHttpRequest(BASE_URL + "/users?username=" + username, "GET", null);

        System.out.println("User by username " + username + ": " + response);
    }

    // Task 2:
    private static void getAndSaveLatestPostComments(int userId) throws IOException {
        String postsResponse = sendHttpRequest(BASE_URL + "/users/" + userId + "/posts", "GET", null);

        int latestPostId = findLatestPostId(postsResponse);

        String commentsResponse = sendHttpRequest(BASE_URL + "/posts/" + latestPostId + "/comments", "GET", null);

        String fileName = "user-" + userId + "-post-" + latestPostId + "-comments.json";
        FileUtil.writeToFile(fileName, commentsResponse);
        System.out.println("Comments for latest post saved to file: " + fileName);
    }

    private static int findLatestPostId(String postsResponse) {
        JsonArray postsArray = JsonParser.parseString(postsResponse).getAsJsonArray();
        int latestPostId = -1;
        for (int i = 0; i < postsArray.size(); i++) {
            JsonObject post = postsArray.get(i).getAsJsonObject();
            int postId = post.getAsJsonPrimitive("id").getAsInt();
            if (postId > latestPostId) {
                latestPostId = postId;
            }
        }
        return latestPostId;
    }

    // Task 3
    private static void getAllOpenTasksForUser(int userId) throws IOException {
        String tasksUrl = BASE_URL + "/users/" + userId + "/todos";
        String tasksResponse;
        tasksResponse = sendHttpRequest(tasksUrl, "GET", null);

        JsonArray tasksArray = JsonParser.parseString(tasksResponse).getAsJsonArray();
        for (JsonElement taskElement : tasksArray) {
            JsonObject taskObject = taskElement.getAsJsonObject();
            boolean completed = taskObject.getAsJsonPrimitive("completed").getAsBoolean();
            if (!completed) {
                int taskId = taskObject.getAsJsonPrimitive("id").getAsInt();
                String title = taskObject.getAsJsonPrimitive("title").getAsString();
                System.out.println("Open task for user " + userId + ": [Task ID: " + taskId + ", Title: " + title + "]");
            }
        }
    }
}

