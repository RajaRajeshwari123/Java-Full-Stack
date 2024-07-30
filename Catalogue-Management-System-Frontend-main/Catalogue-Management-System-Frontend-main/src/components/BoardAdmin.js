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
import "./BoardAdmin.css";
import AddProductAndFeatures from "./AddProductandFeatures";

const BoardAdmin = () => {
  const navigate = useNavigate();

  const adminFunctions = [
    { path: "/add-products", title: "Add Product", icon: faPlus ,component:AddProductAndFeatures },
    { path: "/view-product", title: "View Products", icon: faEye },
    { path: "/view-productbyname-admin", title: "Search Products", icon: faSearch },
    { path: "/update-product", title: "Update Products", icon: faEdit },
    { path: "/delete-feature", title: "Delete Features", icon: faTrash  },
    { path: "/delete-product", title: "Delete Product", icon: faTrash },
    { path: "/updateroles", title:"View Users", icon: faUserEdit}
  ];

  return (
    <div className="admin-dashboard">
      <nav className="admin-nav">
        <ul className="admin-nav-list">
          {adminFunctions.map((func, index) => (
            <li key={index} className="admin-nav-item">
              <a 
                href="#"
                className="admin-nav-link"
                onClick={(e) => {
                  e.preventDefault();
                  navigate(func.path);
                }}
              >
                <FontAwesomeIcon icon={func.icon} className="admin-nav-icon" />
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

export default BoardAdmin;