/**
 * ResultURL Class which contains necessary information for each url element to
 * be displayed
 * 
 * @author offirgolan
 * 
 */
public class ResultURL implements Comparable<ResultURL>
{
   private String url, title, description;
   private int urlid, rank;

   public ResultURL(int urlid, String url, int rank, String title, String desc)
   {
      this.setUrlid(urlid);
      this.setUrl(url);
      this.rank = rank;
      this.title = title;
      this.setDescription(desc);
   }

   public ResultURL(int urlid, String url, int rank)
   {
      this.setUrlid(urlid);
      this.setUrl(url);
      this.rank = rank;
   }

   /**
    * Compare function. Object is compared by URL Ranking
    */
   @Override
   public int compareTo(ResultURL arg0)
   {
      return arg0.rank - this.rank;
   }

   @Override
   public String toString()
   {
      return this.rank + "";
   }
   
   /**
    * Set and Get Methods
    */

   public String getUrl()
   {
      return url;
   }

   public void setUrl(String url)
   {
      this.url = url;
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

   public int getUrlid()
   {
      return urlid;
   }

   public void setUrlid(int urlid)
   {
      this.urlid = urlid;
   }
   
   public int getRank()
   {
      return rank;
   }
   
   public void setRank(int rank)
   {
      this.rank = rank;
   }


}