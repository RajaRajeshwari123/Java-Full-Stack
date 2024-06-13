import React, { useState, useEffect } from "react";
import { Routes, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import AuthService from "./services/auth.service";

import Login from "./components/Login";
import Register from "./components/Register";
import Home from "./components/Home";
import Profile from "./components/Profile";

import BoardAdmin from "./components/BoardAdmin";
import BoardManager from "./components/BoardManager";
import BoardUser from "./components/BoardUser";
import Addproduct from "./components/AddProduct";
import AddQuotation from "./components/AddQuotation";
import EventBus from "./common/EventBus";
import AddFeatures from "./components/AddFeature";

import DeleteFeature from "./components/DeleteFeature";
import DeleteParameter from "./components/DeleteParamater";
import DeleteProduct from "./components/DeleteProduct";

import ViewAllProducts from "./components/ViewAllProducts";
import ViewAllProductsMgr from "./components/ViewAllProductsMgr";
import ViewAllProductsUser from "./components/ViewAllProductsUser";
import UpdateProductForm from "./components/UpdateProductForm";
import UpdateUserRole from "./components/UpdateUserRole";

import ProductByNameUser from "./components/ProductByNameUser";
import ProductByNameMgr from "./components/ProductByNameMgr";
import ProductByNameAdmin from "./components/ProductByNameAdmin";

import ProductByIdAdmin from "./components/ProductByIdAdmin";
import ProductByIdMgr from "./components/ProductByIdMgr";
import QuotationById from "./components/QuotationById";

const App = () => {
  const [showManagerBoard, setShowManagerBoard] = useState(false);
  const [showAdminBoard, setShowAdminBoard] = useState(false);
  const [showUserBoard, setShowUserBoard] = useState(false);
  const [currentUser, setCurrentUser] = useState(undefined);

  useEffect(() => {
    const user = AuthService.getCurrentUser();

    if (user) {
      setShowUserBoard(user.role.includes("ROLE_CUSTOMER"));
      setCurrentUser(user);
      setShowManagerBoard(user.role.includes("ROLE_MANAGER"));
      setCurrentUser(user);
      setShowAdminBoard(user.role.includes("ROLE_ADMIN"));
      setCurrentUser(user);
    }

    EventBus.on("logout", () => {
      logOut();
    });

    return () => {
      EventBus.remove("logout");
    };
  }, []);

  const logOut = () => {
    AuthService.logout();
    setShowManagerBoard(false);
    setShowAdminBoard(false);
    setCurrentUser(undefined);
  };

  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-gradient-primary">
        <Link to={"/"} className="navbar-brand">
          CMS Project
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <div className="navbar-nav mr-auto">
            <Link to={"/home"} className="nav-link">
              Home
            </Link>

            {showManagerBoard && (
              <Link to={"/manager"} className="nav-link">
                Manager Board
              </Link>
            )}

            {showAdminBoard && (
              <Link to={"/admin"} className="nav-link">
                Admin Board
              </Link>
            )}

            {showUserBoard && (
              <Link to={"/customer"} className="nav-link">
                User Board
              </Link>
            )}
          </div>

          {currentUser ? (
            <div className="navbar-nav ml-auto">
              <Link to={"/profile"} className="nav-link">
                {currentUser.username}
              </Link>
              <Link to={"/login"} className="nav-link" onClick={logOut}>
                LogOut
              </Link>
            </div>
          ) : (
            <div className="navbar-nav ml-auto">
              <Link to={"/login"} className="nav-link">
                Login
              </Link>

              <Link to={"/register"} className="nav-link">
                Sign Up
              </Link>
            </div>
          )}
        </div>
      </nav>

      <div className="container mt-3">
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/home" element={<Home/>} />
          <Route path="/login" element={<Login/>} />
          <Route path="/register" element={<Register/>} />
          <Route path="/profile" element={<Profile/>} />
          {/* <Route path="/user" element={<BoardUser/>} />
          <Route path="/mod" element={<BoardModerator/>} /> */}
          <Route path="/admin" element={<BoardAdmin/>} />
          <Route path="/manager" element={<BoardManager/>} />
          <Route path="/customer" element={<BoardUser/>} />
          <Route path="/add-product" element={<Addproduct/>} />
          <Route path="/add-features" element={<AddFeatures/>} />
          <Route path="/add-quotation" element={<AddQuotation/>} />
          <Route path="/delete-param" element={<DeleteParameter/>} />
          <Route path="/delete-feature" element={<DeleteFeature/>} />
          <Route path="/delete-product" element={<DeleteProduct/>} />
          <Route path="/view-product" element={<ViewAllProducts/>} />
          <Route path="/view-productss" element={<ViewAllProductsMgr/>} />
          <Route path="/view-products" element={<ViewAllProductsUser/>} />
          <Route path="/update-product" element={<UpdateProductForm/>} />
          <Route path="/update-userrole" element={<UpdateUserRole/>} />
          <Route path="/get-productbynameuser" element={<ProductByNameUser/>} />
          <Route path="/get-productbynamemanager" element={<ProductByNameMgr/>} />
          <Route path="/get-productbynameadmin" element={<ProductByNameAdmin/>} />
          <Route path="/get-productbyid" element={<ProductByIdAdmin/>} />
          <Route path="/get-productbyidmanager" element={<ProductByIdMgr/>} />
          <Route path="/view-quotations" element={<QuotationById/>}/>
         
          
        </Routes>
      </div>

    </div>
  );
};

export default App;
