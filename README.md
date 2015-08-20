# sample-portlet
An Honest Portlet Sample, that can be verified on Pluto. Download Pluto-Tomcat bundle from Apache.
Build it and deploy on Pluto, on __webapps__ folder.

Go to the __Pluto Admin__ page and add the portlet to a new Page, for better results.

# Notes to configure on Eclipse
Bear in mind that Portlets are an ancient technology, and some production 
Portal Servers work on Java 1.6 even in 2015 (IBM Portal Server 8, for instance).
So, it is better to keep with Eclipse Luna (4.4.2), which still runs on 1.6. 
You can run it on Mars, of course, after all the project is configured to 1.6. 
It is your decision.

To run Pluto inside Eclipse as a __Server Runtime__, first download Pluto-Tomcat bundle
from https://portals.apache.org/pluto/download.html. Install it on preferred location.

Create a Server Runtime (apache Tomcat 7.0), and a Server (see Servers View on Eclipse).
Double click on the newly created Server. 

On the __Server locations__, select the __Use Tomcat installation (takes control of Tomcat installation)__ option.

Select the folder where you installed pluto in the __Server path__.

Enter __webapps__ in the __Deploy Path__ field.

Now, import the project into Eclipse, using __Import...->Maven->Existing Maven Projects...__.

Be happy, and stay safe!




 

