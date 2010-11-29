package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CmdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CmdDet
 * @author MyEclipse Persistence Tools
 */

public class CmdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CmdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CmdDet transientInstance) {
		log.debug("saving CmdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CmdDet persistentInstance) {
		log.debug("deleting CmdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CmdDet findById(com.gopawpaw.erp.hibernate.c.CmdDetId id) {
		log.debug("getting CmdDet instance with id: " + id);
		try {
			CmdDet instance = (CmdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CmdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CmdDet instance) {
		log.debug("finding CmdDet instance by example");
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
		log.debug("finding CmdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CmdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CmdDet instances");
		try {
			String queryString = "from CmdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CmdDet merge(CmdDet detachedInstance) {
		log.debug("merging CmdDet instance");
		try {
			CmdDet result = (CmdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CmdDet instance) {
		log.debug("attaching dirty CmdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CmdDet instance) {
		log.debug("attaching clean CmdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CmdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CmdDetDAO) ctx.getBean("CmdDetDAO");
	}
}