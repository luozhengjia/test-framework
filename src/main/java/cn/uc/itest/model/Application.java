package cn.uc.itest.model;

import java.io.Serializable;

/**
 * @author luozj
 
 * @date 2013-08-31 23:42:49
 */
public class Application  implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Integer id;
    
    /**
     * 
     */
    private String title;
    
    /**
     * 
     */
    private String description;
    
    /**
     * 
     */
    private String dbUrl;
    
    /**
     * 
     */
    private String dbDriver;
    
    /**
     * 
     */
    private String dbUser;
    
    /**
     * 
     */
    private String dbPassword;
    
    public Integer getId()
    {
        return id;
    }
        
    public void setId(Integer id)
    {
        this.id = id;
    }
        
    public String getTitle()
    {
        return title;
    }
        
    public void setTitle(String title)
    {
        this.title = title;
    }
        
    public String getDescription()
    {
        return description;
    }
        
    public void setDescription(String description)
    {
        this.description = description;
    }
        
    public String getDbUrl()
    {
        return dbUrl;
    }
        
    public void setDbUrl(String dbUrl)
    {
        this.dbUrl = dbUrl;
    }
        
    public String getDbDriver()
    {
        return dbDriver;
    }
        
    public void setDbDriver(String dbDriver)
    {
        this.dbDriver = dbDriver;
    }
        
    public String getDbUser()
    {
        return dbUser;
    }
        
    public void setDbUser(String dbUser)
    {
        this.dbUser = dbUser;
    }
        
    public String getDbPassword()
    {
        return dbPassword;
    }
        
    public void setDbPassword(String dbPassword)
    {
        this.dbPassword = dbPassword;
    }
        
}
