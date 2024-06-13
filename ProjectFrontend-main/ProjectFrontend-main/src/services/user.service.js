import axios from "axios";
import authHeader from "./auth-header";

const API_URL = "http://localhost:8086/api/test/";
const ADMIN_URL="http://localhost:8086/api/v1/admin/";
const MANAGER_URL="http://localhost:8086/api/v1/manager/";
const USER_URL="http://localhost:8086/api/v1/customer/";


const getPublicContent = () => {
  return axios.get(API_URL + "all");
};
// const getManagerBoard = () => {
//   return axios.get(MANAGER_URL, { headers: authHeader() });
// };

const getAdminBoard = (payload) => {
  console.log(authHeader());
  return axios.post(ADMIN_URL + "addproduct",payload, {
    headers: {
      ...authHeader(),
    }
     // Set the payload as params
  });
};

const AddQuotation = (payload) => {
  console.log(authHeader());
  return axios.post(MANAGER_URL + "addquotation",payload, {
    headers: {
      ...authHeader(),
    }
     // Set the payload as params
  });
};

const getallmanager = () => {
  console.log(authHeader());
  return axios.get(MANAGER_URL + "getallproducts", {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const getproductbynamemanager = (name) => {
  console.log(authHeader());
  return axios.get(`${MANAGER_URL}getproductbyName?name=${name}`, {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const getproductbynameadmin = (name) => {
  console.log(authHeader());
  return axios.get(`${ADMIN_URL}getproductsbyName?name=${name}`, {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const getUserBoard = (payload) => {
  console.log(authHeader());
  return axios.post(USER_URL + "getallproduct",payload, {
    headers: {
      ...authHeader(),
    }
     // Set the payload as params
  });
};

const getalluser = () => {
  console.log(authHeader());
  return axios.get(USER_URL + "getallproducts", {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const getproductbynameuser = (name) => {
  console.log(authHeader());
  return axios.get(`${USER_URL}getproductbyname?name=${name}`, {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const addFeatures = (payload) => {
  console.log(authHeader());
  return axios.post(ADMIN_URL + "addfeature",payload, {
    headers: {
      ...authHeader(),
    }
     // Set the payload as params
  });
};

const delFeatures = (id) => {
  console.log(authHeader());
  return axios.post(ADMIN_URL + "deletefeaturebyid",id, {
    headers: {
      'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};
const delProduct = (id) => {
  console.log(authHeader());
  return axios.post(ADMIN_URL + "deleteproductbyid",id, {
    headers: {
      'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};

const delparam = (id) => {
  console.log(authHeader());
  return axios.post(ADMIN_URL + "deleteparameterbyid",id, {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};

const getall = () => {
  console.log(authHeader());
  return axios.get(ADMIN_URL + "getallproducts", {
    headers: {
  'Content-Type':'application/json',    
  'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
     // Set the payload as params
  });
};


const getproductbyidadmin = (id) => {
  console.log(authHeader());
  return axios.get(`${ADMIN_URL}getproductsbyId?id=${id}`, {
    headers: {
      'Content-Type': 'application/json',    
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};
const getproductbyidmanager = (id) => {
  console.log(authHeader());
  return axios.get(`${MANAGER_URL}getproductbyid?id=${id}`, {
    headers: {
      'Content-Type': 'application/json',    
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};

const getQuotationById = (id) => {
  console.log(authHeader());
  return axios.get(`${MANAGER_URL}getquotationbyid?id=${id}`, {
    headers: {
      'Content-Type': 'application/json',    
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};


const updateproduct = (productId, updatedProduct) => {
  console.log(authHeader());
  return axios.put(ADMIN_URL + "updateproduct?id=" + productId, updatedProduct, {
    headers: {
      'Content-Type': 'application/json',    
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};
const getproductbyid = (id) => {
  console.log(authHeader());
  return axios.get(`${ADMIN_URL}getproductsbyId?id=${id}`, {
    headers: {
      'Content-Type': 'application/json',    
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};
const updateUserRole = (userId, role) => {
  return axios.put(ADMIN_URL + 'users/updaterole?userId=' + userId, role, {
    headers: {
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      ...authHeader()
    }
  });
};

const UserService = {
  getPublicContent,
  getUserBoard,
  AddQuotation,
  getAdminBoard,
  addFeatures,
  delFeatures,
  delProduct,
  delparam,
  getall,
  getalluser,
  getallmanager,
  getproductbynamemanager,
  getproductbynameuser,
  getproductbynameadmin,
  getproductbyidadmin,
  getproductbyidmanager,
  getQuotationById,
  updateUserRole,
  getproductbyid,
  updateproduct

};




export default UserService;
