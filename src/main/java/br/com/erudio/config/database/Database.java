package br.com.erudio.config.database;


public class Database {

    public String getDriver(String local) {

        String driver = "Local inválido";

        if (local.equals("mysql")) {
            return driver = "com.mysql.cj.jdbc.Driver";
        } else {
            return driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        }
    }

    public String getURL(String local) {

        String url = "Local inválido";

        if (local.equals("mysql")) {
            return url = "jdbc:mysql://magnaSQL:3306/bd_magna";
        } else {
            return url;
        }
    }

    public String getLogin(String local) {

        String login = "Local inválido";

        if (local.equals("mysql")) {
            return login = "root";
        } else if (local.equals("azure")) {
            return login = "admin-magna";
        } else {
            return login;
        }
    }

    public String getSenha(String local) {

        String senha = "Local inválido";

        if (local.equals("mysql")) {
            return senha = "urubu100";
        } else {
            return senha;
        }
    }
}