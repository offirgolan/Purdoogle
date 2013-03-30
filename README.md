Purdoogle
=========

A Java Based Web Crawler and Search Engine

The Database
============

<h3>URL Table</h3>
<table style="text-align: left; width: 50%;" border="1" cellpadding="2"
 cellspacing="2">
  <tbody>
    <tr>
      <td style="vertical-align: top;">URLID<br>
      </td>
      <td style="vertical-align: top;">URL<br>
      </td>
      <td style="vertical-align: top;">Rank<br>
      </td>
      <td style="vertical-align: top;">Title<br>
      </td>
      <td style="vertical-align: top;">Description<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">0<br>
      </td>
      <td style="vertical-align: top;">http://www.cs.purdue.edu<br>
      </td>
      <td style="vertical-align: top;">4<br>
      </td>
      <td style="vertical-align: top;">Computer Science Department<br>
      </td>
      <td style="vertical-align: top;">Computer Science Department ....<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">1<br>
      </td>
      <td style="vertical-align: top;">http://www.cs.purdue.edu/homes/cs390lang/java<br>
      </td>
      <td style="vertical-align: top;">1<br>
      </td>
      <td style="vertical-align: top;">Advanced Java<br>
      </td>
      <td style="vertical-align: top;">CS390java: Advanced Java...<br>
      </td>
    </tr>
  </tbody>
</table>
<br>
This table will store the list of URLs found during the crawling.<br>
<ul>
  <li>URLID -&nbsp; It is the number of this URL in the table and it
will uniquely identify this URL.</li>
  <li>URL - It is the URL found</li>
  <li>Rank - Page calculated rank</li>
  <li>Title - It is the page title</li>
  <li>Description - It is a fragment of the text content of this URL.
You can save for example the first 100 characters of the URL.</li>
</ul>
<h3>Images Table</h3>
<table style="text-align: left; width: 50%;" border="1" cellpadding="2"
 cellspacing="2">
  <tbody>
    <tr>
      <td style="vertical-align: top;">URLID<br>
      </td>
      <td style="vertical-align: top;">URL<br>
      </td>
      <td style="vertical-align: top;">Rank<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">0<br>
      </td>
      <td style="vertical-align: top;">http://www.cs.purdue.edu/news/images/bxd.jpg<br>
      </td>
      <td style="vertical-align: top;">17<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">1<br>
      </td>
      <td style="vertical-align: top;">http://www.cs.purdue.edu/news/lawsons-sculpture.jpg<br>
      </td>
      <td style="vertical-align: top;">2<br>
      </td>
    </tr>
  </tbody>
</table>
<br>
This table will store the list of image URLs found during the crawling.<br>
<ul>
  <li>URLID -&nbsp; It is the number of this URL in the table and it
will uniquely identify this URL.</li>
  <li>URL - It is the URL found</li>
  <li>Rank - Page calculated rank</li>
</ul>
<h3>Word Table</h3>
<table style="text-align: left; width: 50%;" border="1" cellpadding="2"
 cellspacing="2">
  <tbody>
    <tr>
      <td style="vertical-align: top;">Word<br>
      </td>
      <td style="vertical-align: top;">URLList<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">Computer<br>
      </td>
      <td style="vertical-align: top;">1,5,7,3<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">Science<br>
      </td>
      <td style="vertical-align: top;">3,6,7<br>
      </td>
    </tr>
  </tbody>
</table>
<br>

<h3>Image Word Table</h3>
<table style="text-align: left; width: 50%;" border="1" cellpadding="2"
 cellspacing="2">
  <tbody>
    <tr>
      <td style="vertical-align: top;">Word<br>
      </td>
      <td style="vertical-align: top;">URLList<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">Computer<br>
      </td>
      <td style="vertical-align: top;">1,5,7,3<br>
      </td>
    </tr>
    <tr>
      <td style="vertical-align: top;">Science<br>
      </td>
      <td style="vertical-align: top;">3,6,7<br>
      </td>
    </tr>
  </tbody>
</table>
<br>
These tables will store the list of words and the URLs / images that contain them.<br>
<ul>
  <li>Word - It is a keyword found in one or more URLs</li>
  <li>URLList - It is a string with the list of all the URLs / images that
contain that word. Since the length of this string is variable, you can
use a VARCHAR type. </li>
</ul>

The Crawler
===========

The webcrawler program uses <i>breadth-first search</i> and will have the syntax:
	
	webcrawl [-u <maxurls>] [-d domain] [-r] url-list

Where <b>maxurls</b>  is the maximum number of URLs that will be traversed. By default it is 1000. <b>domain</b> is the domain used to restrict the links added to the table of URLs. Only the URLs in this domain will be added. <b>url-list</b> is the list of starting URL's that will be traversed. The <b>-r</b> flag tells the crawler whether to reset the database or to start where it last left off. 

Alternatively, these settings are stored in <b>database.properties</b>. This is a multi-threaded crawler and the number of threads can be changed by changing the global variable nThread in the crawler class. 

The Properties Manager
======================

This GUI based application that allows the user to quickly and easily change the <i>database.properties</i> file. Just run the PropertiesManager application to start. 

The Search Engine
=================

This servlet is a Google-like search engine that includes both web and image search. I recreated the CSS and HTML myself and was able to get the look and feel I wanted. Using javascript and jQuery plugins, I was able to include live url previews and a popup like image gallery (fancyBox). Screenshots can be found in the screenshots folder. 