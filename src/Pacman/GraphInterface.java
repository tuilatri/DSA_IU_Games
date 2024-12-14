package Pacman;
public interface GraphInterface {
    void setEdge (Node start, Node end, int weight);        //Adds edge   
    void deleteEdge(Node start, Node end);                  //Removes an edge
    boolean edgeExists(Node start, Node end);               //determines if an edge exists between two nodes
    int getSize();                                          //returns the size of the graph
    void dumpGraph();                                       //display the graph
}
