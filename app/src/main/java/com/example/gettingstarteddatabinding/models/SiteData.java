package com.example.gettingstarteddatabinding.models;

public class SiteData {


    String  siteDescription = "WebSite For Online Payment";

    String siteName = "Amazon";

    String siteLink = "Amazon.com";

    public String GetName (){

        return "Facebook.com";
    }

    public String getValue ( String x){

        if(x.equals("hassan"))
            return "hassan";
        else
            return "ibrahim";

    }

    public String getSiteName() {
        return siteName;
    }
    public String getSiteLink() {
        return siteLink;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }
}
