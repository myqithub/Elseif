/**
 * @author: Veysel Dogan
 * Date: 04-Aug-2018
 * Console Application: ifElseif
 * Main Class
 */
package ifelseif;

public class IfElseif {

    public static void main(String[] args) {
        int month = 2;//if user will chose 2 3... will write this seasons in screen else wrong chose 
        String seasons;
        if (month == 12 || month == 1 || month == 2) {
            seasons = "Winter";
        } else if (month == 3 | month == 4 | month == 5) {
            seasons = "Spring";
        } else if (month == 6 | month == 7 | month == 8) {
            seasons = "Summer";
        } else if (month == 9 | month == 10 | month == 11) {
            seasons = "Autumn";
        } else {
            seasons = "Wrong Choose";//else wrong chose will write wrong in screen 
        }
        System.out.println("result:" + seasons);
//so else if condition if this is not the case, this happens It means
    }
}
