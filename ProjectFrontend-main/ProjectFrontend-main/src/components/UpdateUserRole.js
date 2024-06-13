import React, { useState } from "react";
import UserService from "../services/user.service";

const UpdateUserRole = () => {
  const [userId, setUserId] = useState("");
  const [roleId, setRoleId] = useState(""); // New state for role ID
  const [roleName, setRoleName] = useState("");
  const [successMessage, setSuccessMessage] = useState("");
  const [errorMessage, setErrorMessage] = useState("");

  const handleUpdateRole = async (e) => {
    e.preventDefault();
    try {
      const response = await UserService.updateUserRole(userId, { id: roleId, name: roleName });
      setSuccessMessage(response.data);
      setErrorMessage("");
    } catch (error) {
      console.error("Error updating user role:", error);
      if (error.response && error.response.data) {
        setErrorMessage(error.response.data);
      } else {
        setErrorMessage("An unexpected error occurred.");
      }
      setSuccessMessage("");
    }
  };

  return (
    <div className="container mt-5">
      <div className="card">
        <div className="card-header">
          <h2 className="mb-0">Update User Role</h2>
        </div>
        <div className="card-body">
          <form onSubmit={handleUpdateRole}>
            <div className="mb-3">
              <label htmlFor="userId" className="form-label">User ID:</label>
              <input type="number" id="userId" className="form-control" value={userId} onChange={(e) => setUserId(e.target.value)} required />
            </div>
            <div className="mb-3">
              <label htmlFor="roleId" className="form-label">Role ID:</label>
              <input type="number" id="roleId" className="form-control" value={roleId} onChange={(e) => setRoleId(e.target.value)} required />
            </div>
            <div className="mb-3">
              <label htmlFor="roleName" className="form-label">Role Name:</label>
              <input type="text" id="roleName" className="form-control" value={roleName} onChange={(e) => setRoleName(e.target.value)} required />
            </div>
            <button type="submit" className="btn btn-primary">Update Role</button>
          </form>
          {successMessage && <p className="mt-4 text-success">{successMessage}</p>}
          {errorMessage && <p className="mt-4 text-danger">{errorMessage}</p>}
        </div>
      </div>
    </div>
  );
};

export default UpdateUserRole;
