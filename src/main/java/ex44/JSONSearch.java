package ex44;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class JSONSearch {

    //Initializing json file into iterable JSONArray
    public static JSONArray initializeArray(JSONParser parser) {
        JSONArray products = null;

        try {
            //Read json file and store in object
            Object obj = parser.parse(new FileReader("exercise44_input.json"));

            //Create json object from object to read the product details
            JSONObject jsonObject = (JSONObject)obj;

            //Reading products array from  the file
            products = (JSONArray) jsonObject.get("products");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }

    public static boolean searchArray(JSONArray products, Boolean run) throws IOException {
        String input;
        int stringcheck = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Get user query
        System.out.print("What is the product name? ");
        input = bufferedReader.readLine();

        //Create iterator for products array
        Iterator iterator = products.iterator();


        //Loop through the iterator
        while (iterator.hasNext()) {

            //Create another json
            JSONObject json = (JSONObject) iterator.next();

            //Get the value of name
            String name = (String)json.get("name");

            //Compare it with the user input
            if(input.toLowerCase().equals(name.toLowerCase())){

                //Output the details of the product if name matches
                System.out.println("Name: "+name);
                System.out.println("Price: "+json.get("price"));
                System.out.println("Quantity: "+json.get("quantity"));

                //Set variables to exit while loop
                stringcheck = 1;
                run = false;
            }
        }

        //If stringcheck value is zero, then value is not found
        if(stringcheck == 0){
            System.out.println("Sorry, that product was not found in our inventory");
        }

        return run;
    }
}
