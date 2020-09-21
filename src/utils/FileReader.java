
class FileReader {

    public String[] readFile(String path) {
        File file = new File(filePath);
        try {
            List<String> lines = Files.lines(Paths.get(file.toURI()))
                    .filter(line -> line != null && !line.equals(""))
                    .map(String::trim)
                    .map(BibleLengths::removeOddCharacters)
                    .collect(Collectors.toList());
            return new ArrayList<String>(lines);
        } catch (Exception e) {
            System.out.println("readFile error - " + e);
            return null;
        }
    }

}