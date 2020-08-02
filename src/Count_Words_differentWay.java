public class Count_Words_differentWay {
    public static void main(String[] args) {
        String str = "cat dog cat cat cat cat".toLowerCase();
        int count = 0;
        int countdog = 0;
        while (str.contains("cat")) {   // if this statetment is true
            count++;
            str = str.replaceFirst("cat", "");
        }

        while (str.contains("dog")) {   // if this statetment is true
            countdog++;
            str = str.replace("dog", "");

        }


        System.out.println(countdog + " dog");
        System.out.println(count + "  cat");

        System.out.println("=========new one ===============");


        String languages = "javajavajavapython";
        int countJava = 0;
        int countPython = 0;

        while (languages.contains("java")){
            countJava++;
            languages = languages.replace("java", "");
        }


        while (languages.contains("python")){
            countPython++;        // increases count by one
            languages = languages.replace("python", "");
                         // removes one java from string
        }

        System.out.println("num of java: " + countJava);
        System.out.println("num of python: " + countPython);


    }
}
