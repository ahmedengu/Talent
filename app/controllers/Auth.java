package controllers;

/**
 * Created by ahmedengu.
 */

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.FileDataStoreFactory;

import java.io.File;
import java.util.List;

/**
 * Shared class used by every sample. Contains methods for authorizing a user and caching credentials.
 */
public  class Auth {
   public static String refreshToken = null;
    public static String clientId = "295298618538-3efprfhttm64j0ra52femog9fp55tsr6.apps.googleusercontent.com";
    public static String clientSecret = "YyZxIaq6fRBpFEVUVj0Pf1Tx";


    /**
     * Define a global instance of the HTTP transport.
     */
    public static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

    /**
     * Define a global instance of the JSON factory.
     */
    public static final JsonFactory JSON_FACTORY = new JacksonFactory();

    /**
     * This is the directory that will be used under the user's home directory where OAuth tokens will be stored.
     */
    public static final String CREDENTIALS_DIRECTORY = ".oauth-credentials";

    /**
     * Authorizes the installed application to access user's protected data.
     *
     * @param scopes              list of scopes needed to run youtube upload.
     * @param credentialDatastore name of the credential datastore to cache OAuth tokens
     */
    public static Credential authorize(List<String> scopes, String credentialDatastore) throws Exception {

//        // Load client secrets.'
////        Reader clientSecretReader = new InputStreamReader(new FileInputStream("C:\\Users\\ahmedengu\\Documents\\IdeaProjects\\Talent\\client_secrets.json"));
////        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, clientSecretReader);
//        GoogleClientSecrets googleClientSecrets = new GoogleClientSecrets();
//        googleClientSecrets.setWeb(new GoogleClientSecrets.Details().setClientId(clientId).setClientSecret(clientSecret));
//        GoogleClientSecrets clientSecrets = googleClientSecrets;
//        // This creates the credentials datastore at ~/.oauth-credentials/${credentialDatastore}
//
//        FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(System.getProperty("user.home") + "/" + CREDENTIALS_DIRECTORY));
//        DataStore<StoredCredential> datastore = fileDataStoreFactory.getDataStore(credentialDatastore);
//
//        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, scopes).setCredentialDataStore(datastore)
//                .build();
//
//
//        // Build the local server and bind it to port 8080
//        LocalServerReceiver localReceiver = new LocalServerReceiver.Builder().setPort(8080).build();
//
//        // Authorize.
//        Credential user = new AuthorizationCodeInstalledApp(flow, localReceiver).authorize("user");
////        if(user.getRefreshToken()!=null)
////        refreshToken = user.getRefreshToken();
//        return user;

        // Load client secrets.

                GoogleClientSecrets googleClientSecrets = new GoogleClientSecrets();
        googleClientSecrets.setWeb(new GoogleClientSecrets.Details().setClientId(clientId).setClientSecret(clientSecret));
        GoogleClientSecrets clientSecrets = googleClientSecrets;



        // This creates the credentials datastore at ~/.oauth-credentials/${credentialDatastore}
        FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(System.getProperty("user.home") + "/" + CREDENTIALS_DIRECTORY));
        DataStore<StoredCredential> datastore = fileDataStoreFactory.getDataStore(credentialDatastore);

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, scopes).setCredentialDataStore(datastore)
                .build();

        // Build the local server and bind it to port 8080
        LocalServerReceiver localReceiver = new LocalServerReceiver.Builder().setPort(8080).build();

        // Authorize.
        return new AuthorizationCodeInstalledApp(flow, localReceiver).authorize("user");

    }
}