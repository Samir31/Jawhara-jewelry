package com.jawhara.controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.jawhara.dao.FournisseurDao;
import com.jawhara.dao.ProduitDao;
import com.jawhara.entity.Fournisseur;
import com.jawhara.entity.Produit;
