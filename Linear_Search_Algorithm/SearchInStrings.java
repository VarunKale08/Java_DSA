package Linear_Search_Algorithm;

public class SearchInStrings {
    public static void main(String[] args) {
        String nae = "Kunal";
        char target = 'u';
        System.out.println(search2(nae, 'f'));
    }

    // using for-each loop
    static boolean search2(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for (char a : str.toCharArray()) 
        {
                if(a == target)
                {
                    return true;
                }
        }

        return false;
    }


    static boolean search(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for (int i = 0; i < str.length(); i++) 
        {
                if(target == str.charAt(i))
                {
                    return true;
                }
        }

        return false;
    }
}
