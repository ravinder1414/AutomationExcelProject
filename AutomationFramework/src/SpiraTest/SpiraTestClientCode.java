package SpiraTest;


import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage;
import org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter;
import org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident;
import org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease;
import org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort;

import com.inflectra.www.SpiraTest.Services.v4_0.IImportExport;
import com.inflectra.www.SpiraTest.Services.v4_0.ImportExportLocator;

public class SpiraTestClientCode {

	  /**
     * Print the release notes for a particular release.
     * 
     * @param p_projectId the project id, in SpiraTeam if a project is PR000062 then use 62 
     * @param p_releaseVersion the release Version, in spiraTeam is shown as Version # 
     * @param p_user user name used for authentication
     * @param p_passwd password used for authentication
     * @throws ServiceException
     * @throws ServiceFaultMessage
     * @throws RemoteException
     */
    private static void printReleaseNotes(int p_projectId, String p_releaseVersion, String p_user, String p_passwd) throws ServiceException, ServiceFaultMessage, RemoteException
    {
        int releaseId = 0; // spira team release id
        IImportExport spiraImportExport = null;
        try
        {
        	System.out.println("Making the setup ready");
            ImportExportLocator spiraTeamLocator = new ImportExportLocator();
            System.out.println("Locate the service");
            spiraTeamLocator.setMaintainSession(true); // enable cookies
            System.out.println("maintain session");
            spiraTeamLocator.setEndpointAddress(spiraTeamLocator.getBasicHttpBinding_IImportExportWSDDServiceName(), spiraTeamLocator.getBasicHttpBinding_IImportExportAddress());
            System.out.println("Set End point");
            spiraImportExport = spiraTeamLocator.getBasicHttpBinding_IImportExport();
            System.out.println("Setting up ");
            spiraImportExport.connection_Authenticate(p_user, p_passwd);
            System.out.println("Authenticated");
            spiraImportExport.connection_ConnectToProject(p_projectId);
            System.out.println("connected to the service");
            
            // get the release id
            RemoteFilter[] releaseFilters = new RemoteFilter[1];
            releaseFilters[0] = getStringFilter("VersionNumber", p_releaseVersion);
            RemoteRelease[] releases = spiraImportExport.release_Retrieve2(releaseFilters, 1, 4);
            if (releases.length != 1)
            {
                System.err.println("Web service found " + releases.length + " releases for version: " + String.valueOf(p_releaseVersion));
                return;
            }
            releaseId = releases[0].getReleaseId();
            
            // only want incidents resolved in a single release
            RemoteFilter[] incidentFilters = new RemoteFilter[1];
            incidentFilters[0] = getIntFilter("ResolvedReleaseId", releaseId);
            
            // want the list of incidents sorted by Incident number, lowest
            // incident number first
            RemoteSort remoteSort = new RemoteSort();
            remoteSort.setPropertyName("IncidentId");
            remoteSort.setSortAscending(true);
            
            // make the web service call to get the incidents
            RemoteIncident[] remoteIncidents = spiraImportExport.incident_Retrieve(incidentFilters, remoteSort, 1, 9999);
            
            // Loop through and display ID, and name
            for (RemoteIncident remoteIncident : remoteIncidents)
            {
                System.out.print(remoteIncident.getIncidentId().toString());
                System.out.print("  ");
                System.out.println(remoteIncident.getName().toString());
            }
        }
        finally
        {
            if (spiraImportExport != null)
            {
                spiraImportExport.connection_Disconnect(); // tidy up
            }
        }
    }
    
    private static RemoteFilter getStringFilter(String p_name, String p_value)
    {
        RemoteFilter filter = new RemoteFilter();
        filter.setPropertyName(p_name);
        filter.setStringValue(p_value);
        return filter;
    }
    
    private static RemoteFilter getIntFilter(String p_name, int p_value)
    {
        RemoteFilter filter = new RemoteFilter();
        filter.setPropertyName(p_name);
        filter.setIntValue(p_value);
        return filter;
    }
    
    public static void main(String[] args) throws Exception
    {
        int projectId = 75 ;   // PR000028;  
        String user = "bharat.sethi";
        String passwd = "Password";
        String releaseVersion = "2.1.0__13";  // Version #
        if (args.length == 1)
        {
            releaseVersion = args[0];
        } 
        System.out.println("Entering to main");
        printReleaseNotes(projectId, releaseVersion, user, passwd);
    }

}
