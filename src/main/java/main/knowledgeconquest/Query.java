/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

/**
 *
 * @author Adam
 */
public class Query {
    private String question;
    private String correctAnswer;
    private String[] incorrectAnswers;
    
    
    
    
    public void sendApiRequest(int category) {
        try {
                // making httpclient
                HttpClient client = HttpClient.newHttpClient();
                    
                //making query to open trivia db api
                // ifyyyyyy
                String apiUrl = "";
                if(category == 0){ // mathematics
                    apiUrl = "https://opentdb.com/api.php?amount=1&category=19&type=multiple";
                }
                else if(category == 1){// science and nature
                    apiUrl = "https://opentdb.com/api.php?amount=1&category=17&type=multiple";
                }
                else if (category == 2){ // history
                    apiUrl = "https://opentdb.com/api.php?amount=1&category=23&type=multiple";
                }
                else if (category == 3){ // geography
                    apiUrl = "https://opentdb.com/api.php?amount=1&category=22&type=multiple";
                }
           
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(apiUrl))
                        .build();
                    
                // making query and get ans
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                // read ans from server
                if (response.statusCode() == 200) {
                    //transformating json
                    ObjectMapper objectMapper = new ObjectMapper();
                    JsonNode jsonNode = objectMapper.readTree(response.body());
                        
                    question = jsonNode.at("/results/0/question").asText();
                    correctAnswer = jsonNode.at("/results/0/correct_answer").asText();
                        
                    JsonNode incorrectAnswersNode = jsonNode.at("/results/0/incorrect_answers");
                    incorrectAnswers = objectMapper.treeToValue(incorrectAnswersNode, String[].class);
                        
                        
                    System.out.println("Question: " + question);
                    System.out.println("Correct Answer: " + correctAnswer);
                    System.out.println("Incorrect Answers: " + Arrays.toString(incorrectAnswers));
                       
                } else {
                    System.out.println("Request failed. Response Code: " + response.statusCode());
                }
                    
            } catch (Exception e){
                e.printStackTrace();
            }
    }
    
    public String getQuestion(){
        return question;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public String[] getIncorrectAnswers(){
        return incorrectAnswers;
    }
}
