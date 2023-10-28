package trafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"GREEN RED YELLOW".split(" ") -> ["GREEN", "RED", "YELLOW"]
        Color[] colors = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Color::valueOf).toArray(Color[]::new);

        int n = Integer.parseInt(scanner.nextLine()); //колко на брой пъти ще сменя цвета на светофарите

        List<TrafficLight> trafficLightList = new ArrayList<>(); //списък с всички светофари
        for(Color color : colors) {
            //нов светофар, който свети с този цвят
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight);
        }

        //списък със светофарите
        for (int i = 1; i <= n; i++) {
            //сменяме цвета на всеки един светофар
            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
