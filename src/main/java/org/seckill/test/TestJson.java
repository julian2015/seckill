package org.seckill.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;



public class TestJson {
	public static void main(String[] args) {
		 String fullFileName = "/Users/liangjun/Desktop/json/test.json";
         
	        File file = new File(fullFileName);
	        Scanner scanner = null;
	        StringBuilder buffer = new StringBuilder();
	        try {
	            scanner = new Scanner(file, "utf-8");
	            while (scanner.hasNextLine()) {
	                buffer.append(scanner.nextLine());
	            }
	 
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block  
	 
	        } finally {
	            if (scanner != null) {
	                scanner.close();
	            }
	        }
	      //  String fotmatStr = TestJson.format(buffer.toString());
	       // System.out.println(fotmatStr);
	        System.out.println(jsonFormatter(buffer.toString()));
	}
	
	
	 /**
     * 得到格式化json数据  退格用\t 换行用\r
     */
//    public static String format(String jsonStr) {
//        int level = 0;
//        StringBuffer jsonForMatStr = new StringBuffer();
//        for(int i=0;i<jsonStr.length();i++){
//            char c = jsonStr.charAt(i);
//            if(level>0&&'\n'==jsonForMatStr.charAt(jsonForMatStr.length()-1)){
//                jsonForMatStr.append(getLevelStr(level));
//            }
//            switch (c) {
//            case '{':
//            case '[':
//                jsonForMatStr.append(c+"\n");
//                level++;
//                break;
//            case ',':
//                jsonForMatStr.append(c+"\n");
//                break;
//            case '}':
//            case ']':
//                jsonForMatStr.append("\n");
//                level--;
//                jsonForMatStr.append(getLevelStr(level));
//                jsonForMatStr.append(c);
//                break;
//            default:
//                jsonForMatStr.append(c);
//                break;
//            }
//        }
//         
//        return jsonForMatStr.toString();
// 
//    }
//     
//    private static String getLevelStr(int level){
//        StringBuffer levelStr = new StringBuffer();
//        for(int levelI = 0;levelI<level ; levelI++){
//            levelStr.append("\t");
//        }
//        return levelStr.toString();
//    }
// 
    
    public static String jsonFormatter(String uglyJSONString){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(uglyJSONString);
		String prettyJsonString = gson.toJson(je);
		return prettyJsonString;
	}

}
