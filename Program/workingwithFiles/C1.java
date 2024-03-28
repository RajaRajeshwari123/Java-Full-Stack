package classworkdayseven.workingwithFiles;
import java.util.Map;
public class C1{
public static void main(String[] args) {
    String filePath = "D:\\File\\Country.csv";
    Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
    char startsWith = 'I'; // no country name start with s actually
    String outputFile = "D:\\K.txt";
    CountryMap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
    System.out.println("Filtered countries have been written to the file.");
}
}