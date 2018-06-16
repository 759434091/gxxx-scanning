package indi.a9043.gree_scanning.config;

import org.json.JSONObject;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.io.*;

/**
 * @author a9043 卢学能 zzz13129180808@gmail.com
 */
@Configuration
public class GreeDataSource {

    @Bean
    @Primary
    public DataSource getGreeDataSource() {
        File dir = new File(System.getProperty("user.dir"));
        File file = new File("F:\\IdeaProjects\\gree-scanning\\src\\main\\resources\\db.json");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            JSONObject dbObj = new JSONObject(stringBuilder.toString());
            DataSourceProperties dataSourceProperties = new DataSourceProperties();
            dataSourceProperties.setUrl(dbObj.getString("url"));
            dataSourceProperties.setUsername(dbObj.getString("username"));
            dataSourceProperties.setPassword(dbObj.getString("password"));
            EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
            embeddedDatabaseBuilder.addScript("classpath:test.sql").addScript("classpath:data.sql");
            embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2);
            return embeddedDatabaseBuilder.build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
