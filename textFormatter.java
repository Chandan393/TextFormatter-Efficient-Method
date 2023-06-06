public class textFormatter {

    public static void main(String[] args) {
        String data = "ECONOMY_HAND&BAGGAGE-ONLY ONLY.BAG*bag Spice sPICE_spiceSaver (5kg)";

        String result = formatText(data);

        System.out.println(result);
    }

    public static String formatText(String data) {
        String[] word = data.split("[\\s.&*,_-]");
        String formattedData = "";
        for (int i = 0; i < word.length; i++) {
            formattedData += Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1).toLowerCase() + " ";
        }         
        return formattedData.trim();
    }
  }
