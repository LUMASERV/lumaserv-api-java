package com.lumaserv.client.auth;

import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

public class AuthClient extends HTTPClient {
    public AuthClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public AuthClient(String apiKey) {
        this(apiKey, "https://auth.lumaserv.com");
    }

    private HTTPRequest wrapRequest(HTTPRequest r) throws ClientException {
        if(r.status() < 200 || (r.status() >= 300 && r.status() < 400))
            throw new ClientException(r);
        return r;
    }

    public ProjectSingleResponse createProject(ProjectCreateRequest body) throws ClientException {
        return wrapRequest(post("/projects", body)).object(ProjectSingleResponse.class);
    }

    public ProjectListResponse getProjects() throws ClientException {
        return wrapRequest(get("/projects")).object(ProjectListResponse.class);
    }

    public ProjectListResponse getProjects(int page, int pageSize, String search, boolean detail) throws ClientException {
        return wrapRequest(get("/projects").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).query("detail", String.valueOf(detail))).object(ProjectListResponse.class);
    }

    public ProjectSingleResponse getProject(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/projects/"+id)).object(ProjectSingleResponse.class);
    }

    public ProjectSingleResponse getProject(java.util.UUID id, boolean detail) throws ClientException {
        return wrapRequest(get("/projects/"+id).query("detail", String.valueOf(detail))).object(ProjectSingleResponse.class);
    }

    public EmptyResponse deleteProject(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/projects/"+id)).object(EmptyResponse.class);
    }

    public ProjectSingleResponse updateProject(java.util.UUID id, ProjectUpdateRequest body) throws ClientException {
        return wrapRequest(put("/projects/"+id, body)).object(ProjectSingleResponse.class);
    }

    public LoginResponse login(LoginRequest body) throws ClientException {
        return wrapRequest(post("/login", body)).object(LoginResponse.class);
    }

    public UserSingleResponse createUser(UserCreateRequest body) throws ClientException {
        return wrapRequest(post("/users", body)).object(UserSingleResponse.class);
    }

    public UserListResponse getUsers() throws ClientException {
        return wrapRequest(get("/users")).object(UserListResponse.class);
    }

    public UserListResponse getUsers(int page, int pageSize, String search) throws ClientException {
        return wrapRequest(get("/users").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search))).object(UserListResponse.class);
    }

    public UserSingleResponse getUser(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/users/"+id)).object(UserSingleResponse.class);
    }

    public UserSingleResponse updateUser(java.util.UUID id, UserUpdateRequest body) throws ClientException {
        return wrapRequest(put("/users/"+id, body)).object(UserSingleResponse.class);
    }

    public EmptyResponse requestPasswordReset(RequestPasswordResetRequest body) throws ClientException {
        return wrapRequest(post("/password-reset", body)).object(EmptyResponse.class);
    }

    public EmptyResponse executePasswordReset(ExecutePasswordResetRequest body) throws ClientException {
        return wrapRequest(put("/password-reset", body)).object(EmptyResponse.class);
    }

    public EmptyResponse insertAuditLogEntry(AuditLogRequest body) throws ClientException {
        return wrapRequest(post("/audit-log", body)).object(EmptyResponse.class);
    }

    public AuditLogEntryListResponse searchAuditLog() throws ClientException {
        return wrapRequest(get("/audit-log")).object(AuditLogEntryListResponse.class);
    }

    public AuditLogEntryListResponse searchAuditLog(String userId, String projectId, String objectType, java.util.UUID objectId) throws ClientException {
        return wrapRequest(get("/audit-log").query("user_id", String.valueOf(userId)).query("project_id", String.valueOf(projectId)).query("object_type", String.valueOf(objectType)).query("object_id", String.valueOf(objectId))).object(AuditLogEntryListResponse.class);
    }

    public TokenSingleResponse createToken(TokenCreateRequest body) throws ClientException {
        return wrapRequest(post("/tokens", body)).object(TokenSingleResponse.class);
    }

    public TokenListResponse getTokens() throws ClientException {
        return wrapRequest(get("/tokens")).object(TokenListResponse.class);
    }

    public TokenListResponse getTokens(String search, int page, int pageSize) throws ClientException {
        return wrapRequest(get("/tokens").query("search", String.valueOf(search)).query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize))).object(TokenListResponse.class);
    }

    public CountrySingleResponse getCountry(String code) throws ClientException {
        return wrapRequest(get("/countries/"+code)).object(CountrySingleResponse.class);
    }

    public TokenSingleResponse getToken(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/tokens/"+id)).object(TokenSingleResponse.class);
    }

    public EmptyResponse deleteToken(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/tokens/"+id)).object(EmptyResponse.class);
    }

    public TokenValidationResponse validateToken(String token) throws ClientException {
        return wrapRequest(get("/validate/"+token)).object(TokenValidationResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/projects/"+id+"/members")).object(ProjectMemberListResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(java.util.UUID id, int page, int pageSize, String search) throws ClientException {
        return wrapRequest(get("/projects/"+id+"/members").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search))).object(ProjectMemberListResponse.class);
    }

    public TransactionLogResponse searchTransactionLog(TransactionLogRequest body) throws ClientException {
        return wrapRequest(post("/transaction-log", body)).object(TransactionLogResponse.class);
    }

    public TokenValidationResponse validateSelf() throws ClientException {
        return wrapRequest(get("/validate/self")).object(TokenValidationResponse.class);
    }

    public EmptyResponse removeProjectMember(java.util.UUID id, java.util.UUID user_id) throws ClientException {
        return wrapRequest(delete("/projects/"+id+"/members/"+user_id)).object(EmptyResponse.class);
    }

    public ProjectMemberListResponse getUserProjectMemberships(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/users/"+id+"/project_memberships")).object(ProjectMemberListResponse.class);
    }

    public CountryListResponse getCountries() throws ClientException {
        return wrapRequest(get("/countries")).object(CountryListResponse.class);
    }

    public CountryListResponse getCountries(String search, int page, int pageSize) throws ClientException {
        return wrapRequest(get("/countries").query("search", String.valueOf(search)).query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize))).object(CountryListResponse.class);
    }


}