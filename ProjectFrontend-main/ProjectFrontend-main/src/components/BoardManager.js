import React, { useState } from "react";
import { Link } from "react-router-dom";

const BoardManager = () => {
  const [dropdownOpen, setDropdownOpen] = useState(false);

  const toggleDropdown = () => {
    setDropdownOpen(!dropdownOpen);
  };

  return (
    <div className="container-manager"> {/* Apply container class here */}
      <div className="managerboard"> {/* Apply managerboard class here */}
        <h2>Manager Dashboard</h2>
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
                <Link to="/get-productbyidmanager" className="dropdown-item">
                  Product By Id
                </Link>
              </li>
              <li>
                <Link to="/get-productbynamemanager" className="dropdown-item">
                  Product By Name
                </Link>
              </li>
              <li>
                <Link to="/view-productss" className="dropdown-item">
                  View Products
                </Link>
                </li>
              <li>
                <Link to="/add-quotation" className="dropdown-item">
                  Add Quotation
                </Link>
              </li>
              <li>
                <Link to="/view-quotations" className="dropdown-item">
                  Quotation By Id
                </Link>
              </li>
              {/* Additional manager actions can be added here */}
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
};

export default BoardManager;
