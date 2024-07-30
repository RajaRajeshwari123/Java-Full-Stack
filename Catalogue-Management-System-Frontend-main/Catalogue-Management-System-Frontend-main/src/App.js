import React, { useState, useEffect } from "react";
import { Routes, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSignIn } from "@fortawesome/free-solid-svg-icons";
import { faUserPlus } from "@fortawesome/free-solid-svg-icons";
import { faUser } from "@fortawesome/free-solid-svg-icons";
import { faBook } from "@fortawesome/free-solid-svg-icons";
import { faHome} from "@fortawesome/free-solid-svg-icons";
import { faInfoCircle} from "@fortawesome/free-solid-svg-icons";
import { faAddressBook} from "@fortawesome/free-solid-svg-icons";
import { faUserCog} from "@fortawesome/free-solid-svg-icons";
import { faCog} from "@fortawesome/free-solid-svg-icons";
// import { faUser} from "@fortawesome/free-solid-svg-icons";

import AuthService from "./services/auth.service";

import Login from "./components/Login";
import Register from "./components/Register";
import Home from "./components/Home";
import Profile from "./components/Profile";

import BoardAdmin from "./components/BoardAdmin";
// import AddProduct from "./components/AddProduct";
import EventBus from "./common/EventBus";
// import AddFeatures from "./components/AddFeature";

import DeleteFeature from "./components/DeleteFeature";
import DeleteParameter from "./components/DeleteParamater";
import DeleteProduct from "./components/DeleteProduct";

import ViewAllProducts from "./components/ViewAllProducts";
import UpdateProductForm from "./components/UpdateProductForm";
import UserBoard from "./components/UserBoard";
import ViewAllproductsuser from "./components/ViewAllproductsuser";
import ProductByName from "./components/ProductByName";
import ManagerBoard from "./components/ManagerBoard";
import ViewAllProductsMgr from "./components/ViewallProductsMgr";
import ViewProductByIdMgr from "./components/ViewProductByIdMgr";

import ViewProductsByIdadmin from "./components/ViewProductsByIdadmin";
import AddQuotation from "./components/AddQuotation";
// import ViewQuotation from "./components/ViewQuotation";
import ProductByNameadmin from "./components/ProductByNameadmin";
import ProductByNamemgr from "./components/ProductByNamemgr";
import UpdateRole from "./components/UpdateRole";
import AllUsers from "./components/AllUsers";
// import About from "./components/About";
// import Contact from "./components/Contact";
import AddProductAndFeatures from "./components/AddProductandFeatures";
import ViewAllQuotations from "./components/ViewAllQuotations";
import UpdateQuotation from "./components/UpdateQuotation";
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
    setShowUserBoard(false);
    setCurrentUser(undefined);
  };

  return (
    <div className="app-navbar">
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <Link to={"/"} className="navbar-brand" style={{ fontWeight: "bold" }}>
          <FontAwesomeIcon
            icon={faBook}
            className="me-1"
            style={{ fontWeight: "bold" }}
          />
          CMS
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
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            {/* Home link */}
            <li className="nav-item">
  <Link to={"/home"} className="nav-link">
    <FontAwesomeIcon icon={faHome} className="me-1" />
    Home
  </Link>
</li>

{/* <li className="nav-item">
  <Link to={"/about"} className="nav-link">
    <FontAwesomeIcon icon={faInfoCircle} className="me-1" />
    About
  </Link>
</li>

<li className="nav-item">
  <Link to={"/contact"} className="nav-link">
    <FontAwesomeIcon icon={faAddressBook} className="me-1" />
    Contact
  </Link>
</li> */}


            {/* Manager Dashboard link (conditionally rendered based on showManagerBoard) */}
            <li className="nav-item">
              {showManagerBoard && (
                <Link to={"/manager"} className="nav-link">
                  <FontAwesomeIcon icon={faUserCog} className="me-1" />
                  Manager Dashboard
                </Link>
              )}
            </li>

            {/* Admin Dashboard link (conditionally rendered based on showAdminBoard) */}
            <li className="nav-item">
              {showAdminBoard && (
                <Link to={"/admin"} className="nav-link">
                  <FontAwesomeIcon icon={faCog} className="me-1" />
                  Admin Dashboard
                </Link>
              )}
            </li>
             {/* User link (conditionally rendered based on showUserBoard) */}
             <li className="nav-item">
              {showUserBoard && (
                <Link to={"/user"} className="nav-link">
                  <FontAwesomeIcon icon={faUser} className="me-1" />
                  User Board
                </Link>
              )}
            </li>

          </ul>

          {/* Right-aligned section for login/signup or user profile/logout */}
          <div className="navbar-nav ml-auto">
            {currentUser ? (
              // If user is logged in
              <>
                <Link to="/profile" className="nav-link">
                  <FontAwesomeIcon icon={faUser} className="me-1" />
                  Profile
                </Link>
                <Link to={"/login"} className="nav-link" onClick={logOut}>
                  Logout
                </Link>
              </>
            ) : (
              // If user is not logged in
              <>
                <Link
                  to={"/login"}
                  className="nav-link btn btn-outline-custom ms-2 me-20"
                >
                  <FontAwesomeIcon icon={faSignIn} className="me-1" />
                  Login
                </Link>

                <span className="mx-2"></span>

                <Link
                  to={"/register"}
                  className="nav-link btn btn-outline-custom ms-2"
                >
                  <FontAwesomeIcon icon={faUserPlus} className="me-1" />
                  Sign Up
                </Link>
              </>
            )}
          </div>
        </div>
      </nav>
    

      <div className="container-links">
      <Routes>
          <Route path="/" element={<ViewAllProducts/>} />
          <Route path="/home" element={<Home />} />
          <Route path="/login" element={<Login />} />
           {/* <Route path="/about" element={<About />} /> */}
      {/* <Route path="/contact" element={<Contact />} /> */}
          <Route path="/register" element={<Register />} />
          <Route path="/profile" element={<Profile />} />
          <Route path="/admin" element={<BoardAdmin />} />
          {/* <Route path="/add-product" element={<AddProduct />} />
          <Route path="/add-features" element={<AddFeatures />} /> */}
          <Route path="/delete-param" element={<DeleteParameter />} />
          <Route path="/delete-feature" element={<DeleteFeature />} />
          <Route path="/delete-product" element={<DeleteProduct />} />
          <Route path="/view-product" element={<ViewAllProducts />} />
          <Route path="/view-productbyid-admin" element={<ViewProductsByIdadmin />} />
          <Route path="/update-product" element={<UpdateProductForm />} />
          <Route path="/user" element={<UserBoard />} />
          <Route path="/view-all-products" element={<ViewAllproductsuser />} />
          <Route path="/view-products-by-name" element={<ProductByName />} />
          <Route path="/view-productbyname-admin" element={<ProductByNameadmin />} />
          <Route path="/view-product-by-name-mgr" element={<ProductByNamemgr />} />
          <Route path="/manager" element={<ManagerBoard />} />
          <Route path="/view-all-products-mgr" element={<ViewAllProductsMgr />} />
          <Route path="/view-product-by-id-mgr" element={<ViewProductByIdMgr />} />
          <Route path="/create-quotation" element={<AddQuotation />} />
          {/* <Route path="/create-quotation" element={<AddQuotation />} />/ */}
          {/* <Route path="/get-quotation" element={<ViewQuotation />} /> */}
          {/* <Route path="/create-quotation" element={<AddQuotation />} /> */}
          <Route path="/get-quotation" element={<ViewAllQuotations/>} />
          <Route path="/update-rolepage/:userId" element={<UpdateRole/>}/>
          <Route path="add-products" element={<AddProductAndFeatures />} />
          <Route path="/updateroles" element={<AllUsers/>} />
          <Route exact path="/update-quotation/:quotationId" element={<UpdateQuotation/>} />
        </Routes>
      </div>
    </div>
  );
};

export default App;
