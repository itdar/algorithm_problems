package algorithm_sites.codility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Wwb_2_ListingFiles {
    private static final String MUSIC = "music";
    private static final String IMAGES = "images";
    private static final String MOVIES = "movies";
    private static final String OTHER = "other";

    private static Map<String, String> extensionMap = new HashMap<>();
    static {
        extensionMap.put("mp3", MUSIC);
        extensionMap.put("aac", MUSIC);
        extensionMap.put("flac", MUSIC);
        extensionMap.put("jpg", IMAGES);
        extensionMap.put("bmp", IMAGES);
        extensionMap.put("gif", IMAGES);
        extensionMap.put("mp4", MOVIES);
        extensionMap.put("avi", MOVIES);
        extensionMap.put("mkv", MOVIES);
    }

    public String solution(String S) {
        String[] fileList = S.split("\n");

        Map<String, Integer> fileListingMap = new LinkedHashMap<>();
        fileListingMap.put(MUSIC, 0);
        fileListingMap.put(IMAGES, 0);
        fileListingMap.put(MOVIES, 0);
        fileListingMap.put(OTHER, 0);

        for (String file : fileList) {
            String[] fileMeta = file.trim().split(" ");
            String type = getFileType(fileMeta[0]);
            String size = fileMeta[1].substring(0, fileMeta[1].length()-1);

            fileListingMap.put(type, fileListingMap.get(type) + Integer.parseInt(size));
        }

        StringBuilder outputString = new StringBuilder();
        for (Entry<String, Integer> fileInfo : fileListingMap.entrySet()) {
            outputString.append(String.format("%s %db", fileInfo.getKey(), fileInfo.getValue()) + "\n");
        }
        return outputString.toString();
    }

    private String getFileType(String fileFullName) {
        String[] nameParts = fileFullName.split("\\.");
        return extensionMap.getOrDefault(nameParts[nameParts.length-1], OTHER);
    }

}
