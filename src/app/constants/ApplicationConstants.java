package app.constants;

public final class ApplicationConstants {

	private ApplicationConstants() {
    }
    
    //Посочих целия път към цялата директория където е .txt файла,  с по-къс не работи.
    public static final String FILE_PATH = "C:\\Mustafa-Erdzhanov-employees\\TeamLongestPeriod\\src\\resources\\employees.txt";

    public static final String BEST_TEAM_PATTERN = "The pair of employees which worked together on joint projects longest are:%n employeeID: %d & employeeID: %d with total overlap duration %d days";
    public static final String NO_TEAMS_MSG = "Doesn't exist pair of employees which are worked together on joint projects.";

    public static final int EMPTY_COLLECTION_SIZE = 0;
    public static final int INDEX_ZERO = 0;
    public static final int ONE = 1;
    public static final int DEFAULT_OVERLAP_ZERO_DAYS = 0;
}
