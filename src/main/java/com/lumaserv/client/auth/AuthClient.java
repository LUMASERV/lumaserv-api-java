package com.lumaserv.client.auth;

import org.javawebstack.httpclient.HTTPClient;

public class AuthClient extends HTTPClient {
    public AuthClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public AuthClient(String apiKey) {
        this(apiKey, "https://auth.lumaserv.com");
    }

    public ProjectSingleResponse createProject(ProjectCreateRequest body) {
        return post("/projects", body).object(ProjectSingleResponse.class);
    }

    public ProjectListResponse getProjects() {
        return get("/projects").object(ProjectListResponse.class);
    }

    public ProjectListResponse getProjects(int page, int pageSize, String search, boolean detail) {
        return get("/projects").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).query("detail", String.valueOf(detail)).object(ProjectListResponse.class);
    }

    public ProjectSingleResponse getProject(java.util.UUID id) {
        return get("/projects/"+id).object(ProjectSingleResponse.class);
    }

    public ProjectSingleResponse getProject(java.util.UUID id, boolean detail) {
        return get("/projects/"+id).query("detail", String.valueOf(detail)).object(ProjectSingleResponse.class);
    }

    public EmptyResponse deleteProject(java.util.UUID id) {
        return delete("/projects/"+id).object(EmptyResponse.class);
    }

    public ProjectSingleResponse updateProject(java.util.UUID id, ProjectUpdateRequest body) {
        return put("/projects/"+id, body).object(ProjectSingleResponse.class);
    }

    public LoginResponse login(LoginRequest body) {
        return post("/login", body).object(LoginResponse.class);
    }

    public UserSingleResponse createUser(UserCreateRequest body) {
        return post("/users", body).object(UserSingleResponse.class);
    }

    public UserListResponse getUsers() {
        return get("/users").object(UserListResponse.class);
    }

    public UserListResponse getUsers(int page, int pageSize, String search) {
        return get("/users").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(UserListResponse.class);
    }

    public UserSingleResponse getUser(java.util.UUID id) {
        return get("/users/"+id).object(UserSingleResponse.class);
    }

    public UserSingleResponse updateUser(java.util.UUID id, UserUpdateRequest body) {
        return put("/users/"+id, body).object(UserSingleResponse.class);
    }

    public EmptyResponse requestPasswordReset(RequestPasswordResetRequest body) {
        return post("/password-reset", body).object(EmptyResponse.class);
    }

    public EmptyResponse executePasswordReset(ExecutePasswordResetRequest body) {
        return put("/password-reset", body).object(EmptyResponse.class);
    }

    public EmptyResponse insertAuditLogEntry(AuditLogRequest body) {
        return post("/audit-log", body).object(EmptyResponse.class);
    }

    public AuditLogEntryListResponse searchAuditLog() {
        return get("/audit-log").object(AuditLogEntryListResponse.class);
    }

    public AuditLogEntryListResponse searchAuditLog(String userId, String projectId, String objectType, java.util.UUID objectId) {
        return get("/audit-log").query("user_id", String.valueOf(userId)).query("project_id", String.valueOf(projectId)).query("object_type", String.valueOf(objectType)).query("object_id", String.valueOf(objectId)).object(AuditLogEntryListResponse.class);
    }

    public TokenSingleResponse createToken(TokenCreateRequest body) {
        return post("/tokens", body).object(TokenSingleResponse.class);
    }

    public TokenListResponse getTokens() {
        return get("/tokens").object(TokenListResponse.class);
    }

    public TokenListResponse getTokens(String search, int page, int pageSize) {
        return get("/tokens").query("search", String.valueOf(search)).query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).object(TokenListResponse.class);
    }

    public CountrySingleResponse getCountry(String code) {
        return get("/countries/"+code).object(CountrySingleResponse.class);
    }

    public TokenSingleResponse getToken(java.util.UUID id) {
        return get("/tokens/"+id).object(TokenSingleResponse.class);
    }

    public EmptyResponse deleteToken(java.util.UUID id) {
        return delete("/tokens/"+id).object(EmptyResponse.class);
    }

    public TokenValidationResponse validateToken(String token) {
        return get("/validate/"+token).object(TokenValidationResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(java.util.UUID id) {
        return get("/projects/"+id+"/members").object(ProjectMemberListResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(java.util.UUID id, int page, int pageSize, String search) {
        return get("/projects/"+id+"/members").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(ProjectMemberListResponse.class);
    }

    public TransactionLogResponse searchTransactionLog(TransactionLogRequest body) {
        return post("/transaction-log", body).object(TransactionLogResponse.class);
    }

    public TokenValidationResponse validateSelf() {
        return get("/validate/self").object(TokenValidationResponse.class);
    }

    public EmptyResponse removeProjectMember(java.util.UUID id, java.util.UUID user_id) {
        return delete("/projects/"+id+"/members/"+user_id).object(EmptyResponse.class);
    }

    public ProjectMemberListResponse getUserProjectMemberships(java.util.UUID id) {
        return get("/users/"+id+"/project_memberships").object(ProjectMemberListResponse.class);
    }

    public CountryListResponse getCountries() {
        return get("/countries").object(CountryListResponse.class);
    }

    public CountryListResponse getCountries(String search, int page, int pageSize) {
        return get("/countries").query("search", String.valueOf(search)).query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).object(CountryListResponse.class);
    }


}