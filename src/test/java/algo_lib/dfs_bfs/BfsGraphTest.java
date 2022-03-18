package algo_lib.dfs_bfs;

import static org.assertj.core.api.Assertions.assertThat;

import algo_lib.dfs_bfs.BfsGraph.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BfsGraphTest {
    private BfsGraph bfsGraph = new BfsGraph();
    private Node rootNode0;

    /**
     *                      0
     *                  /   |    \
     *                 1    2     3
     *                / \   |    / \
     *              4   5   6   7   8
     *                   \           \
     *                    9(bingo)    10
     */
    @BeforeEach
    void setUp() {
        rootNode0 = new Node();

        Node depth1Node01 = new Node();
        Node depth1Node02 = new Node();
        Node depth1Node03 = new Node();
        rootNode0.add(depth1Node01);
        rootNode0.add(depth1Node02);
        rootNode0.add(depth1Node03);

        Node depth1Node04 = new Node();
        Node depth1Node05 = new Node();
        depth1Node01.add(depth1Node04);
        depth1Node01.add(depth1Node05);

        Node depth1Node06 = new Node();
        depth1Node02.add(depth1Node06);

        Node depth1Node07 = new Node();
        Node depth1Node08 = new Node();
        depth1Node03.add(depth1Node07);
        depth1Node03.add(depth1Node08);

        Node depth1Node09 = Node.of(1);
        depth1Node05.add(depth1Node09);

        Node depth1Node10 = new Node();
        depth1Node08.add(depth1Node10);
    }

    @Test
    void bfsGraphTest_1() {
        int shortest = bfsGraph.bfs(rootNode0);

        assertThat(shortest).isEqualTo(3);
    }
}