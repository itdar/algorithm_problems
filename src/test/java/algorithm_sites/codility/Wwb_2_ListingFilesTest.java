package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Wwb_2_ListingFilesTest {

    private Wwb_2_ListingFiles ww = new Wwb_2_ListingFiles();

    @Test
    void solutionTest1() {
        String result = ww.solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b");

        assertThat(result).isEqualTo("music 1011b\nimages 0b\nmovies 10200b\nother 105b");
    }

}
