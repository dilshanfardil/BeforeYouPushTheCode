package functionalprogramming.mock;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MockDataGenerator
{

    public static MockDataGenerator instance = new MockDataGenerator();

    private MockDataGenerator() {
    }

    public static MockDataGenerator getInstance() {
        return instance;
    }

    public List<Students> getMockDataList(){
        Random random = new Random();

        return IntStream.range(0, 500)
                .mapToObj(i -> {
                    String name = "Student-" + random.nextInt(1000);
                    int age = random.nextInt(30);
                    String address = "No " + i + ", Street " + random.nextInt(100) + ", City " + random.nextInt(10);
                    Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;

                    return new Students(name, age, address, gender);
                })
                .toList();
    }

    public Map<Integer, Students> getMockDataMap() {
        Random random = new Random();

        return IntStream.range(0, 500)
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,
                        i -> {
                            String name = "Amigos" + i;
                            int age = random.nextInt(200);
                            String address = "Address" + i;
                            Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;

                            return new Students(name, age, address, gender);
                        }
                ));

    }


}