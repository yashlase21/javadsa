import java.io.File;
import java.util.Scanner;

public class FolderSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the drive or directory to search in
        System.out.print("Enter the drive letter or directory path (e.g., C, D, or C:\\Users): ");
        String drive = scanner.nextLine().trim();
        
        // Append ':' for drive letters
        if (drive.length() == 1) {
            drive = drive.toUpperCase() + ":\\";
        }

        // Get the folder name to search
        System.out.print("Enter the folder name to search: ");
        String folderName = scanner.nextLine().trim();

        File root = new File(drive);

        if (root.exists() && root.isDirectory()) {
            System.out.println("Searching in " + drive + "...");
            boolean found = searchFolder(root, folderName);
            if (!found) {
                System.out.println("Folder not found.");
            }
        } else {
            System.out.println("Invalid drive or directory path!");
        }

        scanner.close();
    }

    public static boolean searchFolder(File directory, String folderName) {
        File[] files = directory.listFiles();
        if (files == null) return false; // Handle access restrictions

        for (File file : files) {
            if (file.isDirectory()) {
                if (file.getName().equalsIgnoreCase(folderName)) {
                    System.out.println("Folder found: " + file.getAbsolutePath());
                    return true; // Stop searching after finding the first match
                }
                // Recursively search in subdirectories
                boolean found = searchFolder(file, folderName);
                if (found) return true;
            }
        }
        return false;
    }
}
