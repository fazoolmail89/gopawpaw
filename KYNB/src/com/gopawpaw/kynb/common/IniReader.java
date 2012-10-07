package com.gopawpaw.kynb.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class IniReader {

	@SuppressWarnings("rawtypes")
	private HashMap sections = new HashMap();
    private transient String currentSecion;
    private transient Properties current;

    public IniReader(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        read(reader);
        reader.close();
    }

    protected void read(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            parseLine(line);
        }
    }

    @SuppressWarnings("unchecked")
	protected void parseLine(String line) {
        line = line.trim();

        if (line.startsWith("[") && line.endsWith("]")) {

            currentSecion = line.replaceFirst("\\[(.*)\\]", "$1");
            current = new Properties();
            if (current != null) {
                sections.put(currentSecion, current);
            }
        } else if (line.matches(".*=.*")) {
            int i = line.indexOf('=');
            String name = line.substring(0, i);
            String value = line.substring(i + 1);
            //System.out.println("name:" + name + ",value:" + value);
            current.setProperty(name, value);
        }
    }

    public String getValue(String section, String name) {
        Properties p = (Properties) sections.get(section);

        if (p == null) {
            return null;
        }

        String value = p.getProperty(name);
        return value;
    }
}