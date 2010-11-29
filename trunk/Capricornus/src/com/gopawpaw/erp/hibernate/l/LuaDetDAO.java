package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LuaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LuaDet
 * @author MyEclipse Persistence Tools
 */

public class LuaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LuaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LuaDet transientInstance) {
		log.debug("saving LuaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LuaDet persistentInstance) {
		log.debug("deleting LuaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LuaDet findById(com.gopawpaw.erp.hibernate.l.LuaDetId id) {
		log.debug("getting LuaDet instance with id: " + id);
		try {
			LuaDet instance = (LuaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LuaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LuaDet instance) {
		log.debug("finding LuaDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding LuaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LuaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LuaDet instances");
		try {
			String queryString = "from LuaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LuaDet merge(LuaDet detachedInstance) {
		log.debug("merging LuaDet instance");
		try {
			LuaDet result = (LuaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LuaDet instance) {
		log.debug("attaching dirty LuaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LuaDet instance) {
		log.debug("attaching clean LuaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LuaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LuaDetDAO) ctx.getBean("LuaDetDAO");
	}
}