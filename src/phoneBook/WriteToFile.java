package phoneBook;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WriteToFile {
    public void writeUserToFile(User user) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла для записи: \n>>> ");
        String fileName = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName, true);
        // true - добавлять файл, false - перезаписывает файл
        String userDataString = String.join("><",
                "<" + user.getFirstName(),
                user.getSecondName(),
                user.getLastName(),
                user.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                String.valueOf(user.getNumberMobile()),
                user.getGender().toString()) + ">";
        fileWriter.write(userDataString);
        fileWriter.write("\n");
        fileWriter.close();
        System.out.println("Данные пользователя записаны в файл");
    }
}