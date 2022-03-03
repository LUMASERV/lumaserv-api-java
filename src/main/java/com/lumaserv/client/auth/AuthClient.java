package com.lumaserv.client.auth;

import org.javawebstack.httpclient.HTTPClient;

public class AuthClient extends HttpClient {
    public AuthClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public AuthClient(String apiKey) {
        this(apiKey, "https://auth.lumaserv.cloud");
    }

    public ProjectSingleResponse createProject(ProjectCreateRequest body) {
        return post("/projects", body).object(ProjectSingleResponse.class);
    }

    public ProjectListResponse getProjects() {
        return get("/projects").object(ProjectListResponse.class);
    }

    public ProjectListResponse getProjects(int page, int pageSize, String search, boolean detail) {
        return get("/projects").query("page", page).query("page_size", pageSize).query("search", search).query("detail", detail).object(ProjectListResponse.class);
    }

    public ProjectSingleResponse getProject(String id) {
        return get("/projects/"+id).object(ProjectSingleResponse.class);
    }

    public ProjectSingleResponse getProject(String id, boolean detail) {
        return get("/projects/"+id).query("detail", detail).object(ProjectSingleResponse.class);
    }

    public EmptyResponse deleteProject(String id) {
        return delete("/projects/"+id).object(EmptyResponse.class);
    }

    public ProjectSingleResponse updateProject(String id, ProjectUpdateRequest body) {
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
        return get("/users").query("page", page).query("page_size", pageSize).query("search", search).object(UserListResponse.class);
    }

    public UserSingleResponse getUser(String id) {
        return get("/users/"+id).object(UserSingleResponse.class);
    }

    public UserSingleResponse updateUser(String id, UserUpdateRequest body) {
        return put("/users/"+id, body).object(UserSingleResponse.class);
    }

    public EmptyResponse requestPasswordReset(RequestPasswordResetRequest body) {
        return post("/password-reset", body).object(EmptyResponse.class);
    }

    public EmptyResponse executePasswordReset(ExecutePasswordResetRequest body) {
        return put("/password-reset", body).object(EmptyResponse.class);
    }

    public AuditLogResponse searchAuditLog(AuditLogRequest body) {
        return post("/audit-log", body).object(AuditLogResponse.class);
    }

    public TokenSingleResponse createToken(TokenCreateRequest body) {
        return post("/tokens", body).object(TokenSingleResponse.class);
    }

    public TokenListResponse getTokens() {
        return get("/tokens").object(TokenListResponse.class);
    }

    public TokenListResponse getTokens(String search, int page, int pageSize) {
        return get("/tokens").query("search", search).query("page", page).query("page_size", pageSize).object(TokenListResponse.class);
    }

    public CountrySingleResponse getCountry(String code) {
        return get("/countries/"+code).object(CountrySingleResponse.class);
    }

    public TokenSingleResponse getToken(String id) {
        return get("/tokens/"+id).object(TokenSingleResponse.class);
    }

    public EmptyResponse deleteToken(String id) {
        return delete("/tokens/"+id).object(EmptyResponse.class);
    }

    public TokenValidationResponse validateToken(String token) {
        return get("/validate/"+token).object(TokenValidationResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(String id) {
        return get("/projects/"+id+"/members").object(ProjectMemberListResponse.class);
    }

    public ProjectMemberListResponse getProjectMembers(String id, int page, int pageSize, String search) {
        return get("/projects/"+id+"/members").query("page", page).query("page_size", pageSize).query("search", search).object(ProjectMemberListResponse.class);
    }

    public TokenValidationResponse validateSelf() {
        return get("/validate/self").object(TokenValidationResponse.class);
    }

    public EmptyResponse removeProjectMember(String id, String user_id) {
        return delete("/projects/"+id+"/members/"+user_id).object(EmptyResponse.class);
    }

    public ProjectMemberListResponse getUserProjectMemberships(String id) {
        return get("/users/"+id+"/project_memberships").object(ProjectMemberListResponse.class);
    }

    public CountryListResponse getCountries() {
        return get("/countries").object(CountryListResponse.class);
    }

    public CountryListResponse getCountries(String search, int page, int pageSize) {
        return get("/countries").query("search", search).query("page", page).query("page_size", pageSize).object(CountryListResponse.class);
    }


}