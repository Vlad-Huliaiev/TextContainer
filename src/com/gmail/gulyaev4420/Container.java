package com.gmail.gulyaev4420;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "E:\\Container.txt")
public class Container {
    String str = "Highway to hell";


    @saver
    public void save(String path) throws IOException {

        try(FileWriter writer = new FileWriter(path);){
            writer.write(str);
        } catch (IOException d) {
            System.out.println(d.getMessage());
        }
    }
}