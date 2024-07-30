import React from "react";
import { useNavigate } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faPlus,
  faEye,
  faSearch,
  faEdit,
  faTrash,
  faUserEdit,
} from "@fortawesome/free-solid-svg-icons";
import "./ManagerBoard.css";

const ManagerBoard = () => {
  const navigate = useNavigate();

  const managerFunctions = [
    { path: "/create-quotation", title: "Create Quotation", icon: faPlus },
    { path: "/get-quotation", title: "View Quotation", icon: faEye },
    { path: "/view-product-by-name-mgr", title: "Search Products", icon: faSearch },
    { path: "/view-all-products-mgr", title: "View All Products", icon: faEye },
  ];

  return (
    <div className="manager-dashboard">
      <nav className="manager-nav">
        <ul className="manager-nav-list">
          {managerFunctions.map((func, index) => (
            <li key={index} className="manager-nav-item">
              <a 
                href="#"
                className="manager-nav-link"
                onClick={(e) => {
                  e.preventDefault();
                  navigate(func.path);
                }}
              >
                <FontAwesomeIcon icon={func.icon} className="manager-nav-icon" />
                {func.title}
              </a>
            </li>
          ))}
        </ul>
      </nav>
      <div className="background-shape shape1"></div>
      <div className="background-shape shape2"></div>
      <div className="background-shape shape3"></div>
    </div>
  );
};

export default ManagerBoard;