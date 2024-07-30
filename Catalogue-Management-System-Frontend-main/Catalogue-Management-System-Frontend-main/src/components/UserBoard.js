import React from "react";
import { useNavigate } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faEye, faSearch } from "@fortawesome/free-solid-svg-icons";
import "./UserBoard.css";

const UserBoard = () => {
  const navigate = useNavigate();

  const userFunctions = [
    { path: "/view-all-products", title: "View All Products", icon: faEye },
    { path: "/view-products-by-name", title: "Search Products", icon: faSearch },
  ];

  return (
    <div className="user-dashboard">
      <nav className="user-nav">
        <ul className="user-nav-list">
          {userFunctions.map((func, index) => (
            <li key={index} className="user-nav-item">
              <a 
                href="#"
                className="user-nav-link"
                onClick={(e) => {
                  e.preventDefault();
                  navigate(func.path);
                }}
              >
                <FontAwesomeIcon icon={func.icon} className="user-nav-icon" />
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

export default UserBoard;