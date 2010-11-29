package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VeeMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VeeMstr
 * @author MyEclipse Persistence Tools
 */

public class VeeMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VeeMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VeeMstr transientInstance) {
		log.debug("saving VeeMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VeeMstr persistentInstance) {
		log.debug("deleting VeeMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VeeMstr findById(com.gopawpaw.erp.hibernate.v.VeeMstrId id) {
		log.debug("getting VeeMstr instance with id: " + id);
		try {
			VeeMstr instance = (VeeMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VeeMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VeeMstr instance) {
		log.debug("finding VeeMstr instance by example");
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
		log.debug("finding VeeMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VeeMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VeeMstr instances");
		try {
			String queryString = "from VeeMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VeeMstr merge(VeeMstr detachedInstance) {
		log.debug("merging VeeMstr instance");
		try {
			VeeMstr result = (VeeMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VeeMstr instance) {
		log.debug("attaching dirty VeeMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VeeMstr instance) {
		log.debug("attaching clean VeeMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VeeMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VeeMstrDAO) ctx.getBean("VeeMstrDAO");
	}
}