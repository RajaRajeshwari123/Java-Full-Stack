import React, { useState } from "react";
import { Link } from "react-router-dom";

const BoardUser = () => {
  const [dropdownOpen, setDropdownOpen] = useState(false);

  const toggleDropdown = () => {
    setDropdownOpen(!dropdownOpen);
  };

  return (
    <div>
      <h2>User Dashboard</h2>
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
            <Link to="/view-products" className="dropdown-item">
              View Products
            </Link>
          </li>
          <li>
            <Link to="/get-productbynameuser" className="dropdown-item">
              Product By Name
            </Link>
          </li>
          {/* Additional actions relevant to user's role can be added here */}
        </ul>
      </div>
    </div>
  );
};

export default BoardUser;
