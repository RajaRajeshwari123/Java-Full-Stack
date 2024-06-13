import React, { useState } from "react";
import { Link } from "react-router-dom";
// import "./BoardAdmin.css";

const BoardAdmin = () => {
  const [dropdownOpen, setDropdownOpen] = useState(false);

  const toggleDropdown = () => {
    setDropdownOpen(!dropdownOpen);
  };

  return (
    <div className="adminboard">
      <h2 className="admin">Admin Dashboard</h2>
      <div className="dropdown-box">
        <div className="dropdown">
          <button
            className="btn btn-secondary dropdown-toggle"
            type="button"
            id="dropdownMenuButton"
            onClick={toggleDropdown}
          >
            Actions
          </button>
          <ul
            className={`dropdown-menu${dropdownOpen ? " show" : ""}`}
            aria-labelledby="dropdownMenuButton"
          >
            <li>
              <Link to="/add-product" className="dropdown-item">
                Add Product
              </Link>
            </li>
            <li>
              <Link to="/get-productbyid" className="dropdown-item">
                Product By Id
              </Link>
            </li>
            <li>
              <Link to="/get-productbynameadmin" className="dropdown-item">
                Product By Name
              </Link>
            </li>
            <li>
              <Link to="/add-features" className="dropdown-item">
                Add Features
              </Link>
            </li>
            <li>
              <Link to="/view-product" className="dropdown-item">
                View Products
              </Link>
            </li>
            <li>
              <Link to="/update-product" className="dropdown-item">
                Update Products
              </Link>
            </li>
            <li>
              <Link to="/delete-param" className="dropdown-item">
                Delete Parameters
              </Link>
            </li>
            <li>
              <Link to="/delete-feature" className="dropdown-item">
                Delete Features
              </Link>
            </li>
            <li>
              <Link to="/delete-product" className="dropdown-item">
                Delete Product
              </Link>
            </li>
            <li>
              <Link to="/update-userrole" className="dropdown-item">
                Update UserRole
              </Link>
            </li>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default BoardAdmin;
