public class RomanToIntegerFirst {
    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));//621
    }

    public static int romanToInt(String s) {
        char[] ch=s.toCharArray();
        int result = 0;
        for(int i = 0;i<ch.length;i++){
            switch(ch[i]){
                case 'I':
                    result+=1;
                    break;
                case 'V':
                    if(i>0&&ch[i-1] == 'I'){
                        result += 5 - 2;
                    }else{
                        result += 5;
                    }
                    break;
                case 'X':
                    if(i>0&&ch[i-1] == 'I'){
                        result += 10 - 2;
                    }else{
                        result += 10;
                    }
                    break;
                case 'L':
                    if(i>0&&ch[i-1] == 'X'){
                        result += 50 - 20;
                    }else{
                        result += 50;
                    }
                    break;
                case 'C':
                    if(i>0&&ch[i-1] == 'X'){
                        result += 100 - 20;
                    }else{
                        result += 100;
                    }
                    break;
                case 'D':
                    if(i>0&&ch[i-1] == 'C'){
                        result += 500 - 200;
                    }else{
                        result += 500;
                    }
                    break;
                case 'M':
                    if(i>0&&ch[i-1] == 'C'){
                        result += 1000 - 200;
                    }else{
                        result += 1000;
                    }
                    break;
            }
        }
        return result;
    }
}
