package sample.c308.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Status {
    OPEN, CLOSED
}

class Task {
    private Status status;
    private Integer points;

    public Task(Status status, Integer points) {
        this.status = status;
        this.points = points;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}

public class StreamDemo {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(Status.OPEN, 8));
        tasks.add(new Task(Status.OPEN, 5));
        tasks.add(new Task(Status.CLOSED, 10));

        int totalPointsOfOpenTasks = tasks.stream().filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(task -> task.getPoints())
                .sum();
        System.out.println(totalPointsOfOpenTasks);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list1.stream().map(num -> num * num).forEach(num -> System.out.println(num));
        System.out.println("--------------------------------");
        int maxNum = list1.stream().map(num -> num * num).max((x, y) -> x - y).get();
        System.out.println(maxNum);

        System.out.println("--------------------------------");
        List<Integer> cubeList = list1.stream().map(num -> num * num * num).collect(Collectors.toList());
        cubeList.forEach(System.out::println);
    }
}
