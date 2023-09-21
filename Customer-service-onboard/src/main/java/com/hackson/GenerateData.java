package com.hackson;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by song on 2023/9/20.
 */
public class GenerateData {



    public static void main(String[] args) {
        String fileName = "/Users/song/Desktop/portfolio.csv";

        StringBuilder sb = new StringBuilder();

        List<String> columns = Arrays.asList("investment_services", "custody", "ETF_Solutions", "fund_accounting", "risk_anaylistics", "Multi_Asset_Analytics",
                "Digital_experience", "Portfolio_solutions", "FX_services", "Financing_Collateral_Cost");

        sb.append("client_id" + "," + "client_name" + "," + "service_name" + "," + "cost");
        sb.append(System.getProperty("line.separator"));

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(line -> {
                if (line.contains("client_id")) {
                    return;
                }

                if (!line.contains("\"")) {
                    return;
                }

                int last = line.lastIndexOf("\"");

                String clientId = line.substring(0, line.indexOf(","));

                String clientName = line.substring(line.indexOf(",") + 2, last);

                List<String> items = Arrays.asList(line.substring(last + 2).split(","));


                for (int i = 0; i < items.size(); i++) {
                    try {
                        if (null != items.get(i) && !items.get(i).isEmpty() && !items.get(i).contains("N.A") && Double.valueOf(items.get(i)) > 0) {
                            sb.append(clientId + ",");

                            if (clientName.startsWith("\"")) {
                                sb.append(clientName + "\"");
                            } else {
                                sb.append("\"" + clientName + "\"");
                            }

                            sb.append("," + columns.get(i) + "," + Double.valueOf(items.get(i)));
                            sb.append(System.getProperty("line.separator"));
                        }
                    } catch (Exception e) {
                        System.out.println("-------   " + items.get(0) + "    " + items.get(1));
//                        e.printStackTrace();
                    }
                }
            });

            Files.write( Paths.get("/Users/song/Desktop/portfolio_2.csv"), sb.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
