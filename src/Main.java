import java.util.ArrayList;

public class Main {

    private static int[] grades;

    public static ArrayList<Integer> failed(int[] grades){
        ArrayList<Integer>failedGrades=new ArrayList<Integer>();
        for(int grade : grades){
            if(grade<40){
                failedGrades.add(Integer.valueOf(grade));
            }
        }
        return failedGrades;
    }

    public static int average(int[] grades){
        int avg=0;
        for(int grade:grades){
            avg+=grade;
        }
        return avg/ grades.length;
    }

    public static ArrayList<Integer> roundedGrades(int[] grades){
        ArrayList<Integer> rounded=new ArrayList<Integer>();
        for(int grade:grades){
            int nextFiveMultiple=(((int)grade/5)+1)*5;
            if(grade<38){
                rounded.add(Integer.valueOf(grade));
            }
            else if(nextFiveMultiple-grade<3){
                rounded.add(Integer.valueOf(nextFiveMultiple));
            }
            else{
                rounded.add(Integer.valueOf(grade));
            }
        }
        return rounded;
    }

    public static int maxRoundedGrade(int[] grades){
        ArrayList<Integer>roundedG=roundedGrades(grades);
        int maxGrade=-1;
        for(Integer grade:roundedG){
            if(grade>maxGrade){
                maxGrade=grade;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {
        int[] grades={28,39,40,56,78,35,29};
        ArrayList<Integer>failedG=failed(grades);
        int avg=average(grades);
        ArrayList<Integer>roundedG=roundedGrades(grades);
        int maxG=maxRoundedGrade(grades);
        System.out.println(failedG);
        System.out.println(avg);
        System.out.println(roundedG);
        System.out.println(maxG);
    }
}