/**
 * OOPSBannerApp – Main Launcher
 *
 * This class provides a clean entry point to run all use cases of the OOPS Banner system.
 * Run a specific use case by passing it as a command-line argument:
 *   - java OOPSBannerApp UC1
 *   - java OOPSBannerApp UC2
 *   - java OOPSBannerApp UC3
 *   - java OOPSBannerApp UC4
 *
 * @author Ashutosh
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java OOPSBannerApp <UC1|UC2|UC3|UC4>");
            System.out.println("\nRunning UC4 (default)...\n");
            runUC4();
        } else {
            switch (args[0].toUpperCase()) {
                case "UC1":
                    runUC1();
                    break;
                case "UC2":
                    runUC2();
                    break;
                case "UC3":
                    runUC3();
                    break;
                case "UC4":
                    runUC4();
                    break;
                default:
                    System.out.println("Unknown use case: " + args[0]);
                    System.out.println("Supported: UC1, UC2, UC3, UC4");
            }
        }
    }

    private static void runUC1() {
        System.out.println("=== UC1: Simple Message ===");
        System.out.println("OOPS");
    }

    private static void runUC2() {
        System.out.println("=== UC2: Banner with Print Statements ===");
        System.out.println(" *****   *****   ******   ***** ");
        System.out.println("*     * *     *  *     * *     *");
        System.out.println("*     * *     *  *     * *      ");
        System.out.println("*     * *     *  ******   ***** ");
        System.out.println("*     * *     *  *             *");
        System.out.println("*     * *     *  *             *");
        System.out.println(" *****   *****   *        ***** ");
    }

    private static void runUC3() {
        System.out.println("=== UC3: Banner with String.join() ===");
        System.out.println(String.join(" ", "      ***      ", "      ***      ", "   ******   ", "   *****"));
        System.out.println(String.join(" ", "    **   **    ", "    **   **    ", "   **   **   ", "  **"));
        System.out.println(String.join(" ", "   **     **   ", "   **     **   ", "   **    **   ", "  **"));
        System.out.println(String.join(" ", "   **     **   ", "   **     **   ", "   ******     ", "     ***"));
        System.out.println(String.join(" ", "   **     **   ", "   **     **   ", "   **         ", "         **"));
        System.out.println(String.join(" ", "    **   **    ", "    **   **    ", "   **         ", "         **"));
        System.out.println(String.join(" ", "      ***      ", "      ***      ", "   **        ", "   *****"));
    }

    private static void runUC4() {
        System.out.println("=== UC4: Banner with Array and Loop ===");
        String[] lines = new String[7];
        lines[0] = String.join(" ", "      ***      ", "      ***      ", "   ******   ", "   *****");
        lines[1] = String.join(" ", "    **   **    ", "    **   **    ", "   **   **   ", "  **");
        lines[2] = String.join(" ", "   **     **   ", "   **     **   ", "   **    **   ", "  **");
        lines[3] = String.join(" ", "   **     **   ", "   **     **   ", "   ******     ", "     ***");
        lines[4] = String.join(" ", "   **     **   ", "   **     **   ", "   **         ", "         **");
        lines[5] = String.join(" ", "    **   **    ", "    **   **    ", "   **         ", "         **");
        lines[6] = String.join(" ", "      ***      ", "      ***      ", "   **        ", "   *****");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}




    





