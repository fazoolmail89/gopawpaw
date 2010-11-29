package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VesMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VesMstr
 * @author MyEclipse Persistence Tools
 */

public class VesMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VesMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VesMstr transientInstance) {
		log.debug("saving VesMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VesMstr persistentInstance) {
		log.debug("deleting VesMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VesMstr findById(com.gopawpaw.erp.hibernate.v.VesMstrId id) {
		log.debug("getting VesMstr instance with id: " + id);
		try {
			VesMstr instance = (VesMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VesMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VesMstr instance) {
		log.debug("finding VesMstr instance by example");
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
		log.debug("finding VesMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VesMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VesMstr instances");
		try {
			String queryString = "from VesMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VesMstr merge(VesMstr detachedInstance) {
		log.debug("merging VesMstr instance");
		try {
			VesMstr result = (VesMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VesMstr instance) {
		log.debug("attaching dirty VesMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VesMstr instance) {
		log.debug("attaching clean VesMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VesMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VesMstrDAO) ctx.getBean("VesMstrDAO");
	}
}