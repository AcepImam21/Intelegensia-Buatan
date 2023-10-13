/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

import Searching.bfs.BreadthFirstSearch;
import Searching.dls.DepthLimitedSearch;
import Searching.ucs.NodeUCS;
import Searching.ucs.UniformCostSearch;

/**
 *
 * @author imam
 */

public class MainTest2 {
    public static void main(String[] args) {
        Node willowbrook = new Node("Willowbrook");
        Node emberfield = new Node("Emberfield");
        Node sycamoreRidge = new Node("Sycamore Ridge");
        Node stonebridge = new Node("Stonebridge");
        Node crestview = new Node("Crestview");
        Node riverside = new Node("Riverside");
        Node lakeside = new Node("Lakeside");
        Node harborHaven = new Node("Harbor Haven");
        Node meadowbrook = new Node("Meadowbrook");
        Node mapplewood = new Node("Maplewood");
        
        willowbrook.addTetangga(emberfield);
        willowbrook.addTetangga(sycamoreRidge);
        willowbrook.addTetangga(crestview);

        emberfield.addTetangga(willowbrook);

        sycamoreRidge.addTetangga(stonebridge);
        sycamoreRidge.addTetangga(willowbrook);

        stonebridge.addTetangga(riverside);
        stonebridge.addTetangga(sycamoreRidge);

        crestview.addTetangga(willowbrook);
        crestview.addTetangga(harborHaven);
        crestview.addTetangga(riverside);

        riverside.addTetangga(stonebridge);
        riverside.addTetangga(lakeside);

        lakeside.addTetangga(riverside);

        harborHaven.addTetangga(crestview);
        harborHaven.addTetangga(mapplewood);
        harborHaven.addTetangga(meadowbrook);

        meadowbrook.addTetangga(mapplewood);
        meadowbrook.addTetangga(harborHaven);

        mapplewood.addTetangga(harborHaven);
        mapplewood.addTetangga(meadowbrook);


        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(harborHaven, stonebridge);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(harborHaven, stonebridge);
        System.out.println();

        NodeUCS willowbrookUCS = new NodeUCS(willowbrook, 64);
        NodeUCS emberfieldUCS = new NodeUCS(emberfield, 50);
        NodeUCS sycamoreRidgeUCS = new NodeUCS(sycamoreRidge, 141);
        NodeUCS stonebridgeUCS = new NodeUCS(stonebridge, 0);
        NodeUCS crestviewUCS = new NodeUCS(crestview, 115);
        NodeUCS riversideUCS = new NodeUCS(riverside, 90);
        NodeUCS lakesideUCS = new NodeUCS(lakeside, 60);
        NodeUCS harborHavenUCS = new NodeUCS(harborHaven, 147);
        NodeUCS meadowbrookUCS = new NodeUCS(meadowbrook, 160);
        NodeUCS mapplewoodUCS = new NodeUCS(mapplewood, 99);


        willowbrook.addTetangga(emberfield);
        willowbrook.addTetangga(sycamoreRidge);
        willowbrook.addTetangga(crestview);

        emberfield.addTetangga(willowbrook);

        sycamoreRidge.addTetangga(stonebridge);
        sycamoreRidge.addTetangga(willowbrook);

        stonebridge.addTetangga(riverside);
        stonebridge.addTetangga(sycamoreRidge);

        crestview.addTetangga(willowbrook);
        crestview.addTetangga(harborHaven);
        crestview.addTetangga(riverside);

        riverside.addTetangga(stonebridge);
        riverside.addTetangga(lakeside);

        lakeside.addTetangga(riverside);

        harborHaven.addTetangga(crestview);
        harborHaven.addTetangga(mapplewood);
        harborHaven.addTetangga(meadowbrook);

        meadowbrook.addTetangga(mapplewood);
        meadowbrook.addTetangga(harborHaven);

        mapplewood.addTetangga(harborHaven);
        mapplewood.addTetangga(meadowbrook);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(harborHavenUCS, stonebridgeUCS);
        System.out.println();
    }
}
